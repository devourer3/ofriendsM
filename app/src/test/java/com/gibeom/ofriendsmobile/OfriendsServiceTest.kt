package com.gibeom.ofriendsmobile

import android.content.Context
import com.gibeom.ofriendsmobile.data.remote.OfriendsService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import okio.Okio
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert.*
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// Remote 응답 테스트를 MockWebServer로 만들어 Local로 하는 이유
// https://stackoverflow.com/questions/35748656/android-unit-test-with-retrofit2-and-mockito-or-robolectric
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

    @Test
    fun requestPromoItems() {
        runBlocking {
            enqueueResponse("promo.json")
            val resultResponse = service.getFilteredProduct("[0,19]", "{\"promo\":\"1\"}").body()
            assertNotNull(resultResponse)
            assertThat(resultResponse?.size, `is`(20))
            resultResponse?.map {

            }

        }
        val request = mockWebServer.takeRequest()
        assertThat(request.path, `is`("/products?range=%5B0%2C19%5D&filter=%7B%22promo%22%3A%221%22%7D"))

    }


    private fun enqueueResponse(fileName: String, headers: Map<String, String> = emptyMap()) {
        val inputStream = javaClass.classLoader!!.getResourceAsStream("mock-response/$fileName")
        val source = Okio.buffer(Okio.source(inputStream))
        val mockResponse = MockResponse()
        for ((key, value) in headers) {
            mockResponse.addHeader(key, value)
        }
        mockWebServer.enqueue(
            mockResponse.setBody(source.readString(Charsets.UTF_8))
        )
    }
}