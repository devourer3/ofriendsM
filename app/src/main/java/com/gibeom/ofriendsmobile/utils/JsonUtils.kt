package com.gibeom.ofriendsmobile.utils

import android.content.Context
import com.gibeom.ofriendsmobile.R
import com.gibeom.ofriendsmobile.home.data.Category
import com.google.gson.Gson
import org.json.JSONObject
import timber.log.Timber
import java.util.*
import kotlin.reflect.KClass

fun <T> rawJsonToObject(
    ctx: Context,
    rawFile: Int,
    jsonKey: String,
    objects: Class<T>
): MutableList<T> {
    val arr = mutableListOf<T>()
    ctx.resources.openRawResource(rawFile).bufferedReader().use {
        val jsonArr = JSONObject(it.readText()).getJSONArray(jsonKey)
        for (i in 0 until jsonArr.length()) {
            val item = Gson().fromJson(jsonArr.getJSONObject(i).toString(), objects)
            arr.add(item)
        }
        return arr
    }
}