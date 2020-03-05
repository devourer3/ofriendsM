package com.gibeom.ofriendsmobile.data

import okhttp3.Headers

data class Result<T>(
    val status: Status,
    val data: T?,
    val headers: Headers?,
    val message: String?
) {

    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }

    companion object {
        fun <T> success(data: T, headers: Headers?): Result<T> {
            return Result(Status.SUCCESS, data, headers, null)
        }

        fun <T> error(message: String, data: T? = null): Result<T> {
            return Result(Status.ERROR, data, null, message)
        }

        fun <T> loading(data: T? = null): Result<T> {
            return Result(Status.LOADING, data, null, null)
        }
    }
}