package com.gibeom.ofriendsmobile.home.data

import androidx.paging.PageKeyedDataSource
import com.gibeom.ofriendsmobile.data.Result
import com.gibeom.ofriendsmobile.home.ui.HomeViewModel
import com.gibeom.ofriendsmobile.home.ui.PromoViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class ProductPageDataSource
@Inject constructor(
    private val scope: CoroutineScope,
    private val dataSource: HomeRemoteDataSource,
    private val query: String? = "",
    private val promoViewModel: PromoViewModel?,
    private val homeViewModel: HomeViewModel?
) : PageKeyedDataSource<Int, Product>() {
    override fun loadInitial(
        params: LoadInitialParams<Int>,
        callback: LoadInitialCallback<Int, Product>) {
        postStatus(Result.Status.LOADING)
        fetchData(1, params.requestedLoadSize, query) {
            callback.onResult(it, null, 2)
        }
    }

    override fun loadAfter(params: LoadParams<Int>, callback: LoadCallback<Int, Product>) {
        val page = params.key
        fetchData(page, params.requestedLoadSize, query) {
            callback.onResult(it, page + 1)
        }
    }

    override fun loadBefore(params: LoadParams<Int>, callback: LoadCallback<Int, Product>) {
//        val page = params.key
//        fetchData(page, params.requestedLoadSize, query) {
//            callback.onResult(it, page + 1)
//        }
    }

    private fun fetchData(
        page: Int,
        pageSize: Int,
        query: String?,
        callback: (List<Product>) -> Unit
    ) {
        // 비동기 API CALL
        scope.launch(getJobErrorHandler()) {
            val response =
                dataSource.getPrdData("[${pageSize * page - 20},${pageSize * page - 1}]", query)
            when (response.status) {
                Result.Status.SUCCESS -> {
                    postStatus(Result.Status.SUCCESS)
                    val itemSize: String? =
                        response.headers?.get("Content-Range")?.split('/')?.get(1) ?: ""
                    promoViewModel?.setTotalItem(itemSize!!)
                    val results = response.data!!
                    results.forEach { item ->
                        // PagedList 값 수정이 불가능 해, DataSource에서 수정해야 하는 이유
                        // https://stackoverflow.com/questions/53243704/modifying-pagedlist-in-android-paging-architecture-library
                        item.image_link =
                            "https://static.ofriends.co.kr/images/products/" + item.id + "_0.jpg"
                    }
                    callback(results)
                }
                Result.Status.ERROR -> {
                    postError(response.message!!)
                }
                else -> postStatus(Result.Status.LOADING)
            }
        }
    }

    // 코루틴 예외처리
    private fun getJobErrorHandler() = CoroutineExceptionHandler { _, e ->
        postError(e.message ?: e.toString())
    }

    private fun postError(message: String) {
        Timber.e("An error happened: $message")
        postStatus(Result.Status.ERROR)
    }

    private fun postStatus(status: Result.Status) {
        homeViewModel?.lifeNetworkStatus?.postValue(status.toString())
        promoViewModel?.promoNetworkStatus?.postValue(status.toString())
    }

}
