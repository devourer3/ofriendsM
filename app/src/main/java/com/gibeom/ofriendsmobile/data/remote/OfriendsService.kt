package com.gibeom.ofriendsmobile.data.remote

import com.gibeom.ofriendsmobile.home.data.Main
import com.gibeom.ofriendsmobile.home.data.Product
import com.gibeom.ofriendsmobile.productdetail.data.ProductDetail
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface OfriendsService {

    companion object {
        const val END_POINT = "https://api.ofriends.co.kr/"
    }

    @GET("products/main")
    suspend fun getMain(): Response<Main>

    @GET("products")
    suspend fun getFilteredProduct(
        @Query("range") range: String? = null,
        @Query("filter") query: String? = null
    ) : Response<MutableList<Product>>

    @GET("products/{id}")
    suspend fun getProductDetail(
        @Path("id") id: Int): Response<ProductDetail>

}