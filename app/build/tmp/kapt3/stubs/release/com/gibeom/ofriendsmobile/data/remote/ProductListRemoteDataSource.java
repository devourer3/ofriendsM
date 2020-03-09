package com.gibeom.ofriendsmobile.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ/\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lcom/gibeom/ofriendsmobile/data/remote/ProductListRemoteDataSource;", "Lcom/gibeom/ofriendsmobile/data/remote/BaseDataSource;", "service", "Lcom/gibeom/ofriendsmobile/data/remote/OfriendsService;", "(Lcom/gibeom/ofriendsmobile/data/remote/OfriendsService;)V", "getMainData", "Lcom/gibeom/ofriendsmobile/data/Result;", "Lcom/gibeom/ofriendsmobile/home/data/Main;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrdData", "", "Lcom/gibeom/ofriendsmobile/home/data/Product;", "range", "", "query", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class ProductListRemoteDataSource extends com.gibeom.ofriendsmobile.data.remote.BaseDataSource {
    private final com.gibeom.ofriendsmobile.data.remote.OfriendsService service = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getMainData(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.gibeom.ofriendsmobile.data.Result<com.gibeom.ofriendsmobile.home.data.Main>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrdData(@org.jetbrains.annotations.NotNull()
    java.lang.String range, @org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.gibeom.ofriendsmobile.data.Result<java.util.List<com.gibeom.ofriendsmobile.home.data.Product>>> p2) {
        return null;
    }
    
    @javax.inject.Inject()
    public ProductListRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.data.remote.OfriendsService service) {
        super();
    }
}