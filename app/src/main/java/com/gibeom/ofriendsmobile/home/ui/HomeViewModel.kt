package com.gibeom.ofriendsmobile.home.ui

import androidx.lifecycle.*
import com.gibeom.ofriendsmobile.api.Result
import com.gibeom.ofriendsmobile.home.data.HomeRepository
import com.gibeom.ofriendsmobile.home.data.Main
import javax.inject.Inject

// https://tourspace.tistory.com/23

class HomeViewModel
@Inject constructor(
    private val repository: HomeRepository
) : ViewModel() {

    private var mainData: LiveData<Result<Main>>? = repository.observeMainData()

    fun getBanners() = mainData?.map {
        it.data?.banners
    }

    fun getRisingItem() = mainData?.map {
        val prd = it.data?.products
        prd?.forEach { item ->
            item.image_link = "https://static.ofriends.co.kr/images/products/" + item.id + "_0.jpg"
        }
        return@map prd
    }

    fun getCategory() = repository.getCategory()

    override fun onCleared() {
        super.onCleared()
    }
}