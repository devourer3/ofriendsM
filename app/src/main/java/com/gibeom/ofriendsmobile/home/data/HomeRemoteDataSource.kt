package com.gibeom.ofriendsmobile.home.data

import com.gibeom.ofriendsmobile.data.remote.BaseDataSource
import com.gibeom.ofriendsmobile.data.remote.OfriendsService
import javax.inject.Inject

class HomeRemoteDataSource
@Inject
constructor(private val service: OfriendsService) : BaseDataSource() {
  suspend fun getMainData()
          = getResult { service.getMain() }

  suspend fun getPrdData(range:String, query:String?)
          = getResult { service.getFilteredProduct(range, query) }

}