package com.gibeom.ofriendsmobile.utils

import android.content.Context
import com.google.gson.Gson
import org.json.JSONObject

fun <T> rawJsonToList(
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