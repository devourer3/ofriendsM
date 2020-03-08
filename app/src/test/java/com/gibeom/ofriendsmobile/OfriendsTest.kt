package com.gibeom.ofriendsmobile

import com.gibeom.ofriendsmobile.data.remote.OfriendsService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@RunWith(JUnit4::class)
class OfriendsServiceTest {

    private val coroutineScope = CoroutineScope(Dispatchers.IO)
    private lateinit var service: OfriendsService
    private lateinit var mockWebServer: MockWebServer

    @Before
    fun createService() {
        mockWebServer = MockWebServer()
        service = Retrofit.Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(OfriendsService::class.java)
    }

    @After
    fun stopService() {
        mockWebServer.shutdown()
    }

}