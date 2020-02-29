package com.gibeom.ofriendsmobile.api

import com.gibeom.ofriendsmobile.home.data.Main
import retrofit2.Response
import retrofit2.http.GET

interface OfriendsService {

    companion object {
        const val END_POINT = "https://api.ofriends.co.kr/"
    }

    @GET("products/main")
    suspend fun getMain(): Response<Main>
}