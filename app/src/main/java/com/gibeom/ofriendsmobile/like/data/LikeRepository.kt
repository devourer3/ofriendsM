package com.gibeom.ofriendsmobile.like.data

import com.gibeom.ofriendsmobile.data.local.OfriendsDao
import javax.inject.Inject

class LikeRepository
@Inject constructor(
private val dao: OfriendsDao) {

    fun getLocalProduct() {
        dao.getLikes()
    }


}