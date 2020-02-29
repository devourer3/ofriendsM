package com.gibeom.ofriendsmobile.home.data

import com.gibeom.ofriendsmobile.api.BaseDataSource
import com.gibeom.ofriendsmobile.api.OfriendsService
import javax.inject.Inject

class HomeRemoteDataSource
@Inject
constructor(private val service: OfriendsService) : BaseDataSource() {
  suspend fun getMainData() = getResult {
    service.getMain()
  }
}