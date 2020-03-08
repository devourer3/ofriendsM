package com.gibeom.ofriendsmobile.like.ui

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.gibeom.ofriendsmobile.di.CoroutineScropeIO
import com.gibeom.ofriendsmobile.repository.ProductListRepository
import org.junit.Test

import org.junit.runner.RunWith
import org.mockito.Mockito.mock

@RunWith(AndroidJUnit4::class)
class LikeViewModelTest {

    private val likeRepository = mock(ProductListRepository::class.java)

    @Test
    fun observeLocalProduct() {
//        val likeViewModel = LikeViewModel(likeRepository, )
//        likeViewModel.
    }

    @Test
    fun deleteLike() {
    }
}