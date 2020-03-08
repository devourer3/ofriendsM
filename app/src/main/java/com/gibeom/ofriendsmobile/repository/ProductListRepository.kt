package com.gibeom.ofriendsmobile.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.gibeom.ofriendsmobile.data.remote.ProductListRemoteDataSource
import com.gibeom.ofriendsmobile.data.remote.ProductPageDataSourceFactory
import com.gibeom.ofriendsmobile.data.local.OfriendsDao
import com.gibeom.ofriendsmobile.data.resultNetworkLiveData
import com.gibeom.ofriendsmobile.home.data.Category
import com.gibeom.ofriendsmobile.home.data.LifeCategory
import com.gibeom.ofriendsmobile.home.data.Product
import com.gibeom.ofriendsmobile.home.ui.HomeViewModel
import com.gibeom.ofriendsmobile.promo.data.PromoViewModel
import com.gibeom.ofriendsmobile.utils.rawJsonToList
import kotlinx.coroutines.*
import timber.log.Timber
import javax.inject.Inject

class ProductListRepository
@Inject constructor(
    private val remoteDataSource: ProductListRemoteDataSource,
    private val dao: OfriendsDao) {

    // REMOTE

    // http://youknow.kim/2019/12/18/android-architecture-aac-simple/
    // https://developer88.tistory.com/210
    fun observeMainData() =
        resultNetworkLiveData(networkCall = { remoteDataSource.getMainData() })

    fun observeFilteredPrd(
        query: String,
        scope: CoroutineScope,
        homeViewModel: HomeViewModel? = null,
        promoViewModel: PromoViewModel? = null
    ): LiveData<PagedList<Product>> {
        return LivePagedListBuilder(
            ProductPageDataSourceFactory(
                query,
                remoteDataSource,
                scope,
                promoViewModel = promoViewModel,
                homeViewModel = homeViewModel,
                dao = dao),
            ProductPageDataSourceFactory.pagedListConfig()
        ).build()
    }


    // LOCAL

    fun getLocalProduct() = dao.getLikes()

    fun storeProduct(scope: CoroutineScope, product: Product) {
        scope.launch(context = getJobErrorHandler()) {
            dao.insertLike(product)
        }
    }

    fun deleteLocalProduct(scope: CoroutineScope, id:Int) {
        scope.launch(context = getJobErrorHandler()) {
            dao.deleteLike(id)
        }
    }

    suspend fun getProductId(scope: CoroutineScope, id: Int) =
        withContext(scope.coroutineContext + getJobErrorHandler()) {
            return@withContext dao.getProductId(id)
        }

    // 코루틴 예외처리
    private fun getJobErrorHandler() = CoroutineExceptionHandler { _, e ->
        Timber.w("ERROR: $e")
    }

//    suspend fun getProductId(scope: CoroutineScope, number: Int) =
//        scope.async(getJobErrorHandler()) {
//            dao.getProductIdAmt(number)
//        }.await()

}

//  fun getMainData() {
//    mainData = resultNetworkData(networkCall = {
//      remoteDataSource.getMainData()
//    })
//  }