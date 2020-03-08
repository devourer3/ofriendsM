package com.gibeom.ofriendsmobile.data

import okhttp3.Headers


data class Result<T>(
    val status: Status,
    val data: T?,
    val message: String?,
    val headers: Headers? = null
) {
    enum class Status {
        SUCCESS,
        ERROR,
        LOADING
    }
    companion object {
        fun <T> success(data: T): Result<T> {
            return Result(status = Status.SUCCESS, data = data, message = null)
        }

        fun <T> success(data: T, headers: Headers): Result<T> {
            return Result(Status.SUCCESS, data, null, headers)
        }

        fun <T> error(message: String, data: T? = null): Result<T> {
            return Result(Status.ERROR, null, message)
        }

        fun <T> loading(data: T? = null): Result<T> {
            return Result(Status.LOADING, null, null)
        }
    }
}