package com.gibeom.ofriendsmobile.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J5\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lcom/gibeom/ofriendsmobile/data/remote/OfriendsService;", "", "getFilteredProduct", "Lretrofit2/Response;", "", "Lcom/gibeom/ofriendsmobile/home/data/Product;", "range", "", "query", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMain", "Lcom/gibeom/ofriendsmobile/home/data/Main;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductDetail", "Lcom/gibeom/ofriendsmobile/productdetail/data/ProductDetail;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface OfriendsService {
    public static final com.gibeom.ofriendsmobile.data.remote.OfriendsService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String END_POINT = "https://api.ofriends.co.kr/";
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "products/main")
    public abstract java.lang.Object getMain(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gibeom.ofriendsmobile.home.data.Main>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "products")
    public abstract java.lang.Object getFilteredProduct(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "range")
    java.lang.String range, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "filter")
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.gibeom.ofriendsmobile.home.data.Product>>> p2);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "products/{id}")
    public abstract java.lang.Object getProductDetail(@retrofit2.http.Path(value = "id")
    int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.gibeom.ofriendsmobile.productdetail.data.ProductDetail>> p1);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/gibeom/ofriendsmobile/data/remote/OfriendsService$Companion;", "", "()V", "END_POINT", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String END_POINT = "https://api.ofriends.co.kr/";
        
        private Companion() {
            super();
        }
    }
}