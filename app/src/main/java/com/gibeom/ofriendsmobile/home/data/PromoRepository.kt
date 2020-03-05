package com.gibeom.ofriendsmobile.home.data

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.gibeom.ofriendsmobile.home.ui.PromoViewModel
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class PromoRepository
@Inject constructor(
    private val remoteDataSource: HomeRemoteDataSource) {
    fun observeFilteredPrd(
        range: String,
        query: String,
        scope: CoroutineScope,
        viewModel: PromoViewModel
    ): LiveData<PagedList<Product>> {
        return LivePagedListBuilder(
            ProductPageDataSourceFactory(query, remoteDataSource, scope, promoViewModel = viewModel),
            ProductPageDataSourceFactory.pagedListConfig()
        ).build()
    }

}