package com.gibeom.ofriendsmobile.data.remote

import com.gibeom.ofriendsmobile.data.Result
import retrofit2.Response
import timber.log.Timber

/**
 * Abstract Base Data source class with error handling
 */
abstract class BaseDataSource {
  protected suspend fun <T> getResult(call: suspend () -> Response<T>): Result<T> {
    try {
      val response = call()
      if (response.isSuccessful) {
        val headers = response.headers()
        val body = response.body()
        if (body != null) return Result.success(body, headers)
      }
      return error("CODE(${response.code()}): ${response.message()}")
    } catch (e: Exception) {
      return error(e.message ?: e.toString())
    }
  }

  private fun <T> error(message: String): Result<T> {
    Timber.e("Error: $message")
    return Result.error("Network call has failed for a following reason: $message")
  }

}

