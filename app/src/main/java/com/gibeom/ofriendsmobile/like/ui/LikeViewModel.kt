package com.gibeom.ofriendsmobile.like.ui

import androidx.lifecycle.*
import com.gibeom.ofriendsmobile.repository.ProductListRepository
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

class LikeViewModel
@Inject constructor(
    private val repository: ProductListRepository,
    private val scope: CoroutineScope
) : ViewModel() {

    fun observeLocalProduct() = repository.getLocalProduct()

    fun deleteLike(id: Int) = repository.deleteLocalProduct(scope, id)

    override fun onCleared() {
        super.onCleared()
    }
}