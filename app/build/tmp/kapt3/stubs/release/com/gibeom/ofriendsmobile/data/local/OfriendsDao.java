package com.gibeom.ofriendsmobile.data.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H\'J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH\'\u00a8\u0006\r"}, d2 = {"Lcom/gibeom/ofriendsmobile/data/local/OfriendsDao;", "", "deleteLike", "", "id", "", "getLikes", "Landroidx/lifecycle/LiveData;", "", "Lcom/gibeom/ofriendsmobile/home/data/Product;", "getProductId", "insertLike", "product", "app_release"})
public abstract interface OfriendsDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertLike(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.home.data.Product product);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM product")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.gibeom.ofriendsmobile.home.data.Product>> getLikes();
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM product WHERE id = :id")
    public abstract int getProductId(int id);
    
    @androidx.room.Query(value = "DELETE FROM product WHERE id = :id")
    public abstract void deleteLike(int id);
}