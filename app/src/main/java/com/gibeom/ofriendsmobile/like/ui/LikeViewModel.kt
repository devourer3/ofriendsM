package com.gibeom.ofriendsmobile.like.ui

import android.app.Application
import androidx.lifecycle.*
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.home.data.*
import com.gibeom.ofriendsmobile.like.data.LikeRepository
import kotlinx.coroutines.CoroutineScope
import timber.log.Timber
import javax.inject.Inject

class LikeViewModel
@Inject constructor(
    private val repository: LikeRepository,
    private val scope: CoroutineScope
) : ViewModel() {

    fun observeLocalProduct() {
        repository.getLocalProduct()
    }

    override fun onCleared() {
        super.onCleared()
    }
}