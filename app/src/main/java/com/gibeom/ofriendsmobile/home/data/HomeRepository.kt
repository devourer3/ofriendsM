package com.gibeom.ofriendsmobile.home.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.data.local.OfriendsDao
import com.gibeom.ofriendsmobile.data.resultNetworkLiveData
import com.gibeom.ofriendsmobile.home.ui.HomeViewModel
import com.gibeom.ofriendsmobile.utils.rawJsonToList
import kotlinx.coroutines.*
import timber.log.Timber
import javax.inject.Inject

class HomeRepository
@Inject constructor(
    private val remoteDataSource: HomeRemoteDataSource,
    private val context: Application,
    private val dao: OfriendsDao
) {

    // http://youknow.kim/2019/12/18/android-architecture-aac-simple/
    // https://developer88.tistory.com/210
    fun observeMainData() =
        resultNetworkLiveData(networkCall = {
            remoteDataSource.getMainData()
        })

    fun observeFilteredPrd(
        query: String,
        scope: CoroutineScope,
        viewModel: HomeViewModel
    ): LiveData<PagedList<Product>> {
        return LivePagedListBuilder(
            ProductPageDataSourceFactory(query, remoteDataSource, scope, homeViewModel = viewModel),
            ProductPageDataSourceFactory.pagedListConfig()
        ).build()
    }

    // https://developer.android.com/topic/libraries/architecture/coroutines
    fun getAweSomeCategory(): LiveData<MutableList<Category>> {
        return liveData(Dispatchers.IO) {
            emit(rawJsonToList(context, R.raw.cat, "category", Category::class.java))
        }
    }

    fun getLifeCategory(jsonKey: String): LiveData<MutableList<LifeCategory>> {
        return liveData(Dispatchers.IO) {
            emit(rawJsonToList(context, R.raw.life_cat, jsonKey, LifeCategory::class.java))
        }
    }

    fun storeProduct(scope: CoroutineScope, product: Product) {
        scope.launch(context = getJobErrorHandler()) {
            dao.insertLike(product)
        }
    }

    fun deleteProduct(scope: CoroutineScope, id:Int) {
        scope.launch(context = getJobErrorHandler()) {
            dao.deleteLike(id)
        }
    }

    suspend fun getProductId(scope: CoroutineScope, id: Int) =
        withContext(scope.coroutineContext + getJobErrorHandler()) {
            return@withContext dao.getProductId(id)
        }
//    suspend fun getProductId(scope: CoroutineScope, number: Int) =
//        scope.async(getJobErrorHandler()) {
//            dao.getProductIdAmt(number)
//        }.await()

//    Executors.newSingleThreadExecutor().execute {}


    // 코루틴 예외처리
    private fun getJobErrorHandler() = CoroutineExceptionHandler { _, e ->
        Timber.w("ERROR: $e")
    }

}

//  fun getMainData() {
//    mainData = resultNetworkData(networkCall = {
//      remoteDataSource.getMainData()
//    })
//  }