package com.gibeom.ofriendsmobile.home.data

import androidx.lifecycle.MutableLiveData
import com.google.gson.annotations.SerializedName

data class LifeCategory(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("number")
    val number: Int,
    @SerializedName("filter")
    val filter: String,
    var selected: MutableLiveData<Boolean> = MutableLiveData(false)
)