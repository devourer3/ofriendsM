package com.gibeom.ofriendsmobile.data.remote

import com.gibeom.ofriendsmobile.data.Result
import okhttp3.Headers
import retrofit2.Response

/**
 * Abstract Base Data source class with error handling
 */
abstract class BaseDataSource {
    protected suspend fun <T> getResult(call: suspend () -> Response<T>): Result<T> {
        try {
            val response = call()
            if (response.isSuccessful) {
                val body = response.body()
                val code = response.code()
                val header = response.headers()
                body?.let {
                  return if (hasTotalItems(header))
                    Result.success(body, header)
                  else
                    Result.success(body)
                }
            }
            return error("ResCode(${response.code()}): ${response.message() ?: response.errorBody()}")
        } catch (e: Exception) {
            return error(e.message ?: e.toString())
        }
    }

    private fun <T> error(message: String): Result<T> {
        return Result.error("Network call has failed for a following reason: $message")
    }

    private fun hasTotalItems(headers: Headers) = !headers.get("Content-Range").isNullOrEmpty()


}

