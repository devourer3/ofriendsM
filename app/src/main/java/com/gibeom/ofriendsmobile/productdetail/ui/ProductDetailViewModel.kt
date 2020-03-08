package com.gibeom.ofriendsmobile.productdetail.ui

import androidx.lifecycle.*
import com.gibeom.ofriendsmobile.data.Result
import com.gibeom.ofriendsmobile.productdetail.data.ProductDetail
import com.gibeom.ofriendsmobile.repository.ProductDetailRepository
import javax.inject.Inject

class ProductDetailViewModel
@Inject constructor(
    private val repository: ProductDetailRepository
) : ViewModel() {

    private lateinit var detailData: LiveData<Result<ProductDetail>>

    fun getProductDetail(id: Int) {
        detailData = repository.observeDetailData(id)
    }

    fun observeProduct() = detailData.map {
        val product = it.data?.product
        product?.let { item ->
            if (item.no_image > 0) {
                item.imageList = mutableListOf()
                for (i in 0 until item.no_image) {
                    item.imageList?.add(
                        "https://static.ofriends.co.kr/images/products/${item.id}_${i}.jpg"
                    )
                }
            }
        }
        return@map product
    }

    override fun onCleared() {
//        detailData
        super.onCleared()
    }
}