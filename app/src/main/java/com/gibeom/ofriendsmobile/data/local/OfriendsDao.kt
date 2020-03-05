package com.gibeom.ofriendsmobile.data.local

import androidx.lifecycle.LiveData
import androidx.room.*
import com.gibeom.ofriendsmobile.home.data.Product

@Dao
interface OfriendsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLike(product: Product)

    @Query("SELECT * FROM product")
    fun getLikes(): LiveData<MutableList<Product>>

    @Query("SELECT COUNT(*) FROM product WHERE id = :id")
    fun getProductId(id:Int): Int

    @Query("DELETE FROM product WHERE id = :id")
    fun deleteLike(id: Int)


}