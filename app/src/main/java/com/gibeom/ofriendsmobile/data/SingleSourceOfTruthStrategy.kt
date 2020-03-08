package com.gibeom.ofriendsmobile.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.lifecycle.map
import com.gibeom.ofriendsmobile.data.Result.Status.*
import kotlinx.coroutines.Dispatchers

/**
 * The database serves as the single source of truth.
 * Therefore UI can receive data updates from database only.
 * Function notify UI about:
 * [Result.Status.SUCCESS] - with data from database
 * [Result.Status.ERROR] - if error has occurred from any source
 * [Result.Status.LOADING]
 */
fun <T, T1> resultLiveData(
    databaseQuery: () -> LiveData<T>,
    networkCall: suspend () -> Result<T1>,
    saveCallResult: suspend (T1) -> Unit
): LiveData<Result<T>> = liveData(Dispatchers.IO) {
    emit(Result.loading<T>())
    val source = databaseQuery.invoke().map { Result.success(it) }
    emitSource(source)
    val responseStatus = networkCall.invoke()
    if (responseStatus.status == SUCCESS) {
        saveCallResult(responseStatus.data!!)
    } else if (responseStatus.status == ERROR) {
        emit(Result.error(responseStatus.message!!))
        emitSource(source)
    }
}

fun <T> resultNetworkLiveData(networkCall: suspend () -> Result<T>): LiveData<Result<T>> =
    // https://developer.android.com/topic/libraries/architecture/coroutines
    liveData(Dispatchers.IO) {
        emit(Result.loading())
        val responseStatus = networkCall.invoke()
        if (responseStatus.status == SUCCESS) {
            emit(responseStatus)
        } else if (responseStatus.status == ERROR) {
            emit(Result.error(responseStatus.message!!))
        }
    }

fun <T> resultNetworkData(networkCall: () -> Result<T>): Result<T> {
    val responseStatus = networkCall.invoke()
//    Result.loading()
    return when (responseStatus.status) {
        SUCCESS -> {
            responseStatus
        }
        else -> {
            Result.error(responseStatus.message!!)
        }
    }
}