package com.gibeom.ofriendsmobile.home.data

import com.gibeom.ofriendsmobile.data.resultNetworkLiveData
import javax.inject.Inject

class ProductDetailRepository
@Inject constructor(
    private val remoteDataSource: ProductDetailRemoteDataSource) {

    // http://youknow.kim/2019/12/18/android-architecture-aac-simple/
    // https://developer88.tistory.com/210
    fun observeDetailData(id: Int) =
        resultNetworkLiveData(networkCall = {
            remoteDataSource.getPrdDetail(id)
        })
}