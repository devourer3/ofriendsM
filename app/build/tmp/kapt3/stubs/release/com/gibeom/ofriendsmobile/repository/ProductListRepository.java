package com.gibeom.ofriendsmobile.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010J!\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J:\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00160\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0\u0010J\u0016\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010!\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/gibeom/ofriendsmobile/repository/ProductListRepository;", "", "remoteDataSource", "Lcom/gibeom/ofriendsmobile/data/remote/ProductListRemoteDataSource;", "dao", "Lcom/gibeom/ofriendsmobile/data/local/OfriendsDao;", "(Lcom/gibeom/ofriendsmobile/data/remote/ProductListRemoteDataSource;Lcom/gibeom/ofriendsmobile/data/local/OfriendsDao;)V", "deleteLocalProduct", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "id", "", "getJobErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getLocalProduct", "Landroidx/lifecycle/LiveData;", "", "Lcom/gibeom/ofriendsmobile/home/data/Product;", "getProductId", "(Lkotlinx/coroutines/CoroutineScope;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "observeFilteredPrd", "Landroidx/paging/PagedList;", "query", "", "homeViewModel", "Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;", "promoViewModel", "Lcom/gibeom/ofriendsmobile/promo/data/PromoViewModel;", "observeMainData", "Lcom/gibeom/ofriendsmobile/data/Result;", "Lcom/gibeom/ofriendsmobile/home/data/Main;", "storeProduct", "product", "app_release"})
public final class ProductListRepository {
    private final com.gibeom.ofriendsmobile.data.remote.ProductListRemoteDataSource remoteDataSource = null;
    private final com.gibeom.ofriendsmobile.data.local.OfriendsDao dao = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gibeom.ofriendsmobile.data.Result<com.gibeom.ofriendsmobile.home.data.Main>> observeMainData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.gibeom.ofriendsmobile.home.data.Product>> observeFilteredPrd(@org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.Nullable()
    com.gibeom.ofriendsmobile.home.ui.HomeViewModel homeViewModel, @org.jetbrains.annotations.Nullable()
    com.gibeom.ofriendsmobile.promo.data.PromoViewModel promoViewModel) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.gibeom.ofriendsmobile.home.data.Product>> getLocalProduct() {
        return null;
    }
    
    public final void storeProduct(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.home.data.Product product) {
    }
    
    public final void deleteLocalProduct(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, int id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductId(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> p2) {
        return null;
    }
    
    private final kotlinx.coroutines.CoroutineExceptionHandler getJobErrorHandler() {
        return null;
    }
    
    @javax.inject.Inject()
    public ProductListRepository(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.data.remote.ProductListRemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.data.local.OfriendsDao dao) {
        super();
    }
}