package com.gibeom.ofriendsmobile.promo.data

import androidx.lifecycle.*
import androidx.paging.PagedList
import com.gibeom.ofriendsmobile.home.data.Product
import com.gibeom.ofriendsmobile.repository.ProductListRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import javax.inject.Inject

class PromoViewModel
@Inject constructor(
    val repository: ProductListRepository,
    val scope: CoroutineScope
) : ViewModel() {


    private val totalNumber: MutableLiveData<String> = MutableLiveData("0")
    var promoNetworkStatus: MutableLiveData<String> = MutableLiveData("LOADING")

    val query: MutableLiveData<String> = MutableLiveData(("{\"promo\":\"1\"}"))

    // 라이프 탭의 아이템
    var totalItems = query.value?.let { repository.observeFilteredPrd(it, scope, promoViewModel = this) }

    fun getPromoNetworkStatus() = promoNetworkStatus.map {
        return@map it
    }

    fun setTotalItem(value: String?) {
        totalNumber.postValue(value ?: "0")
    }

    fun getTotalItem(): MutableLiveData<String> {
        return totalNumber
    }

//    private fun isLike(id: Int) = runBlocking {
//        repository.getProductId(scope, id).let { count ->
//            return@let count
//        }
//    }

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


    override fun onCleared() {
        super.onCleared()
    }
}