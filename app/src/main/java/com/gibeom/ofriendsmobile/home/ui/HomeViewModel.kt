package com.gibeom.ofriendsmobile.home.ui

import androidx.lifecycle.*
import com.gibeom.ofriendsmobile.data.Result
import com.gibeom.ofriendsmobile.home.data.*
import kotlinx.coroutines.*
import timber.log.Timber
import javax.inject.Inject

// https://tourspace.tistory.com/23
class HomeViewModel
@Inject constructor(
    private val repository: HomeRepository,
    private val scope: CoroutineScope
) : ViewModel() {

    private val mainData: LiveData<Result<Main>> by lazy { repository.observeMainData() }

    // https://blog.mindorks.com/livedata-vs-observable-in-android
    var selectedTab: MutableLiveData<Int> = MutableLiveData(0)

    var selectedLifeMajorTab: MutableLiveData<Int> = MutableLiveData(0)

    var selectedLifeMinorTab: MutableLiveData<Int> = MutableLiveData(-1)

    var lifeQuery: MutableLiveData<MutableList<String>> =
        MutableLiveData(mutableListOf("[0,19]", "{\"cat_major\":\"play\"}"))

    var lifeNetworkStatus: MutableLiveData<String> = MutableLiveData("LOADING")

    fun getAwesomeNetworkStatus() = mainData.map { it.status.toString() }

    fun getLifeNetworkStatus() = lifeNetworkStatus.map { it }

    fun setSelectedTab(value: Int) {
        selectedTab.postValue(value)
    }

    fun getBanners() = mainData.map {
        it.data?.banners
    }

    private fun isLike(id: Int) = runBlocking {
        repository.getProductId(scope, id).let { count ->
            return@let count
        }
    }

    fun likeAction(product: Product, id: Int) = runBlocking {
        repository.getProductId(scope, id).let { count ->
            if (count > 0) {
                repository.deleteProduct(scope, id)
            } else {
                repository.storeProduct(scope, product)
            }
        }
    }

    fun getAwesomeCategory() = repository.getAweSomeCategory()

    //     추천 탭의 아이템
    fun getRisingItem() = mainData.map {
        val prd = it.data?.products
        prd?.forEach { item ->
            item.like = isLike(item.id)
            item.image_link = "https://static.ofriends.co.kr/images/products/" + item.id + "_0.jpg"
        }

        return@map prd
    }

//    fun setSelectedTab(value: Int) {
//        selectedTab.postValue(value)
//    }

    fun setSelectedMajorLifeTab(value: Int, range: String, cate: String) {
        selectedTab.postValue(1)
        selectedLifeMajorTab.postValue(value)
        selectedLifeMinorTab.postValue(-1)
        lifeQuery.postValue(mutableListOf(range, "{\"cat_major\":\"$cate\"}"))
    }

    fun setSelectedMinorLifeTab(value: Int, range: String, cate: String) {
        selectedLifeMinorTab.postValue(value)
        lifeQuery.postValue(mutableListOf(range, "{\"cat_minor\":\"$cate\"}"))
    }

    fun getLifeTabList(value: Int): LiveData<MutableList<LifeCategory>> {
        return when (value) {
            0 -> repository.getLifeCategory("play_sub_cat")
            1 -> repository.getLifeCategory("learn_sub_cat")
            2 -> repository.getLifeCategory("share_sub_cat")
            else -> repository.getLifeCategory("play_sub_cat")
        }
    }

    // 라이프 탭의 아이템 가져오는 메소드
    fun getFilteredPrd(query: String) =
        repository.observeFilteredPrd(query, scope, this)

}