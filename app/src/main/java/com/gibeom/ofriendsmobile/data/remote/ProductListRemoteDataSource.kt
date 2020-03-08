package com.gibeom.ofriendsmobile.data.remote

import com.gibeom.ofriendsmobile.data.remote.BaseDataSource
import com.gibeom.ofriendsmobile.data.remote.OfriendsService
import javax.inject.Inject

class ProductListRemoteDataSource
@Inject
constructor(private val service: OfriendsService) : BaseDataSource() {

    suspend fun getMainData() = getResult { service.getMain() }

    suspend fun getPrdData(range: String, query: String?) =
        getResult { service.getFilteredProduct(range, query) }

}