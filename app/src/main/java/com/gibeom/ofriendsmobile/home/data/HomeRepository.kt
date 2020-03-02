package com.gibeom.ofriendsmobile.home.data

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.api.resultNetworkLiveData
import com.gibeom.ofriendsmobile.utils.rawJsonToList
import kotlinx.coroutines.Dispatchers
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

  fun observeFilteredPrd(range:String, query:String) = resultNetworkLiveData(networkCall = {
    remoteDataSource.getPrdData(range, query)
  })

  // https://developer.android.com/topic/libraries/architecture/coroutines
  fun getAweSomeCategory(): LiveData<MutableList<Category>> {
    return liveData(Dispatchers.IO) {
      emit(rawJsonToList(context, R.raw.cat, "category", Category::class.java))
    }
  }

  fun getLifeCategory(jsonKey: String): LiveData<MutableList<LifeCategory>> {
    return liveData(Dispatchers.IO) {
      emit(rawJsonToList(context, R.raw.life_cat, jsonKey, LifeCategory::class.java))
    }
  }

//  fun getLifeCategory(arrayNo:Int): LiveData<MutableList<String>> {
//    return liveData(Dispatchers.IO) {
//      emit(context.resources.getStringArray(arrayNo).toMutableList())
//    }
//  }

}

//  fun getMainData() {
//    mainData = resultNetworkData(networkCall = {
//      remoteDataSource.getMainData()
//    })
//  }