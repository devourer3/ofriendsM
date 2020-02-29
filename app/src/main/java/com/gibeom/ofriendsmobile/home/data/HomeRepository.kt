package com.gibeom.ofriendsmobile.home.data

import android.app.Application
import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.gibeom.ofriendsmobile.OfriendsApp
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.api.Result
import com.gibeom.ofriendsmobile.api.resultNetworkData
import com.gibeom.ofriendsmobile.api.resultNetworkLiveData
import com.gibeom.ofriendsmobile.utils.rawJsonToObject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HomeRepository
@Inject constructor(private val remoteDataSource: HomeRemoteDataSource,
                    private val context: Application) {

//  lateinit var mainData: LiveData<Result<Main>>

  // http://youknow.kim/2019/12/18/android-architecture-aac-simple/
  // https://developer88.tistory.com/210

  fun observeMainData() = resultNetworkLiveData(networkCall = {
    remoteDataSource.getMainData()
  })


  fun getCategory(): LiveData<MutableList<Category>> {
    return liveData(Dispatchers.IO) {
      emit(rawJsonToObject(context, R.raw.cat, "category", Category::class.java))
    }
  }

}

//  fun getMainData() {
//    mainData = resultNetworkData(networkCall = {
//      remoteDataSource.getMainData()
//    })
//  }