package com.gibeom.ofriendsmobile.home.ui

import android.app.Application
import androidx.lifecycle.*
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.data.Result
import com.gibeom.ofriendsmobile.home.data.Category
import com.gibeom.ofriendsmobile.home.data.LifeCategory
import com.gibeom.ofriendsmobile.home.data.Main
import com.gibeom.ofriendsmobile.home.data.Product
import com.gibeom.ofriendsmobile.repository.ProductListRepository
import com.gibeom.ofriendsmobile.utils.rawJsonToList
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

// https://tourspace.tistory.com/23
class HomeViewModel
@Inject constructor(
    private val repository: ProductListRepository,
    private val context: Application,
    private val scope: CoroutineScope
) : ViewModel() {

    private val mainData: LiveData<Result<Main>> by lazy { repository.observeMainData() }

    var searchTotalNumber: MutableLiveData<String> = MutableLiveData("0")

    // https://blog.mindorks.com/livedata-vs-observable-in-android
    // 추천, 라이프 탭
    var selectedTab: MutableLiveData<Int> = MutableLiveData(0)

    // 라이프 대구분 탭
    var selectedLifeMajorTab: MutableLiveData<Int> = MutableLiveData(0)

    // 라이프 소구분 탭
    var selectedLifeMinorTab: MutableLiveData<Int> = MutableLiveData(-1)

    var lifeQuery: MutableLiveData<String> = MutableLiveData(("{\"cat_major\":\"play\"}"))

    var searchQuery: MutableLiveData<String> = MutableLiveData("{\"q\":\"\"}")

//    private var queryItems = lifeQuery.value?.let { repository.observeFilteredPrd(it, scope, homeViewModel = this) }

    var searchText: MutableLiveData<String> = MutableLiveData("")

    var lifeQueryItems = lifeQuery.switchMap { query ->
        repository.observeFilteredPrd(query, scope, homeViewModel = this)
    }

    var searchQueryItems = searchQuery.switchMap { query ->
        repository.observeFilteredPrd(query, scope, homeViewModel = this)
    }

    val cateItems: MutableList<Category>? = rawJsonToList(context.applicationContext, R.raw.cat, "category", Category::class.java)

    var lifeNetworkStatus: MutableLiveData<String> = MutableLiveData("LOADING")

    var bannerItems = mainData.map { it.data?.banners }

    fun getAwesomeNetworkStatus() = mainData.map { it.status.toString() }

    fun getLifeNetworkStatus() = lifeNetworkStatus.map { it }

    fun setSearchTotalNumber(value: String?) {
        searchTotalNumber.postValue(value ?: "0")
    }

    fun setSelectedTab(value: Int) {
        selectedTab.postValue(value)
    }

//    fun getBanners() = mainData.map {
//        it.data?.banners
//    }

    private fun isLike(id: Int) = runBlocking {
        repository.getProductId(scope, id).let { count ->
            return@let count
        }
    }

    fun likeAction(product: Product, id: Int) = runBlocking {
        repository.getProductId(scope, id).let { count ->
            if (count > 0) {
                repository.deleteLocalProduct(scope, id)
            } else {
                product.like = 1
                repository.storeProduct(scope, product)
            }
        }
    }

    // https://developer.android.com/topic/libraries/architecture/coroutines
    // 메이저 탭
//    fun getAwesomeCategory(): LiveData<MutableList<Category>> = liveData(scope.coroutineContext) {

//    }

    // 마이너 탭
    fun getLifeTabList(value: Int): LiveData<MutableList<LifeCategory>> {
        return when (value) {
            0 -> getLifeCategory("play_sub_cat")
            1 -> getLifeCategory("learn_sub_cat")
            2 -> getLifeCategory("share_sub_cat")
            else -> getLifeCategory("play_sub_cat")
        }
    }

    private fun getLifeCategory(jsonKey: String): LiveData<MutableList<LifeCategory>> {
        return liveData(scope.coroutineContext) {
            emit(rawJsonToList(context.applicationContext, R.raw.life_cat, jsonKey, LifeCategory::class.java))
        }
    }

    // 추천 탭의 아이템 리스트
    fun getRisingItem() = mainData.map {
        val prd = it.data?.products
        prd?.forEach { item ->
            item.like = isLike(item.id)
            item.image_link = "https://static.ofriends.co.kr/images/products/" + item.id + "_0.jpg"
        }
        return@map prd
    }

    fun setSelectedMajorLifeTab(value: Int, cate: String) {
        selectedTab.postValue(1)
        selectedLifeMajorTab.postValue(value)
        selectedLifeMinorTab.postValue(-1)
        lifeQuery.postValue("{\"cat_major\":\"$cate\"}")
    }

    fun setSelectedMinorLifeTab(value: Int, cate: String) {
        selectedLifeMinorTab.postValue(value)
        lifeQuery.postValue("{\"cat_minor\":\"$cate\"}")
    }

    fun setSearchQuery(search: String) {
        searchText.postValue(search)
        searchQuery.postValue("{\"q\":\"$search\"}")
    }

    // 라이프 탭의 아이템 리스트
//    fun getFilteredPrd(query: String) =
//        repository.observeFilteredPrd(query, scope, this)


}