package com.gibeom.ofriendsmobile.home.data

import androidx.lifecycle.MutableLiveData
import androidx.paging.DataSource
import androidx.paging.PagedList
import com.gibeom.ofriendsmobile.home.ui.HomeViewModel
import com.gibeom.ofriendsmobile.home.ui.PromoViewModel
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class ProductPageDataSourceFactory
@Inject constructor(
    private val query: String? = "",
    private val dataSource: HomeRemoteDataSource,
    private val scope: CoroutineScope,
    private val promoViewModel: PromoViewModel? = null,
    private val homeViewModel: HomeViewModel? = null
) : DataSource.Factory<Int, Product>() {
    private val liveData = MutableLiveData<ProductPageDataSource>()
    override fun create(): DataSource<Int, Product> {
        val source = ProductPageDataSource(scope, dataSource, query, promoViewModel, homeViewModel)
        liveData.postValue(source)
        return source
    }

    companion object {
        private const val PAGE_SIZE = 20
        fun pagedListConfig() = PagedList.Config.Builder()
            .setInitialLoadSizeHint(PAGE_SIZE)
            .setPageSize(PAGE_SIZE)
            .setPrefetchDistance(2)
            .setEnablePlaceholders(true)
            .build()
    }
}