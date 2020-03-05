package com.gibeom.ofriendsmobile.home.data

import com.gibeom.ofriendsmobile.data.remote.BaseDataSource
import com.gibeom.ofriendsmobile.data.remote.OfriendsService
import javax.inject.Inject

class ProductDetailRemoteDataSource
@Inject
constructor(private val service: OfriendsService) : BaseDataSource() {

  suspend fun getPrdDetail(id:Int) = getResult { service.getProductDetail(id) }

}