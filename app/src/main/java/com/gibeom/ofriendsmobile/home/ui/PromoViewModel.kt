package com.gibeom.ofriendsmobile.home.ui

import android.app.Application
import androidx.lifecycle.*
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.home.data.*
import kotlinx.coroutines.CoroutineScope
import timber.log.Timber
import javax.inject.Inject

class PromoViewModel
@Inject constructor(
    private val repository: PromoRepository,
    private val scope: CoroutineScope
) : ViewModel() {

    private val totalItems: MutableLiveData<String> = MutableLiveData("")
    var promoNetworkStatus: MutableLiveData<String> = MutableLiveData("LOADING")

    fun getPromoNetworkStatus() = promoNetworkStatus.map {
        return@map it
    }

    fun setTotalItem(value: String) {
        totalItems.postValue(value)
    }

    fun getTotalItem(): MutableLiveData<String> {
        return totalItems
    }

    // 라이프 탭의 아이템 가져오는 메소드
    fun getFilteredPrd(range: String, query: String) =
        repository.observeFilteredPrd(range, query, scope, this)

    override fun onCleared() {
        super.onCleared()
    }
}