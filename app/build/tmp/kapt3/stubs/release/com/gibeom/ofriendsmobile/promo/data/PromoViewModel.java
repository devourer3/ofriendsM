package com.gibeom.ofriendsmobile.promo.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\n\u001a\u0010\u0012\f\u0012\n \u001d*\u0004\u0018\u00010\t0\t0\u0015J\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#J\b\u0010$\u001a\u00020 H\u0014J\u0010\u0010%\u001a\u00020 2\b\u0010&\u001a\u0004\u0018\u00010\tR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/gibeom/ofriendsmobile/promo/data/PromoViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/gibeom/ofriendsmobile/repository/ProductListRepository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/gibeom/ofriendsmobile/repository/ProductListRepository;Lkotlinx/coroutines/CoroutineScope;)V", "promoNetworkStatus", "Landroidx/lifecycle/MutableLiveData;", "", "getPromoNetworkStatus", "()Landroidx/lifecycle/MutableLiveData;", "setPromoNetworkStatus", "(Landroidx/lifecycle/MutableLiveData;)V", "query", "getQuery", "getRepository", "()Lcom/gibeom/ofriendsmobile/repository/ProductListRepository;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "totalItems", "Landroidx/lifecycle/LiveData;", "Landroidx/paging/PagedList;", "Lcom/gibeom/ofriendsmobile/home/data/Product;", "getTotalItems", "()Landroidx/lifecycle/LiveData;", "setTotalItems", "(Landroidx/lifecycle/LiveData;)V", "totalNumber", "kotlin.jvm.PlatformType", "getTotalItem", "likeAction", "", "product", "id", "", "onCleared", "setTotalItem", "value", "app_release"})
public final class PromoViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.String> totalNumber = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> promoNetworkStatus;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> query = null;
    @org.jetbrains.annotations.Nullable()
    private androidx.lifecycle.LiveData<androidx.paging.PagedList<com.gibeom.ofriendsmobile.home.data.Product>> totalItems;
    @org.jetbrains.annotations.NotNull()
    private final com.gibeom.ofriendsmobile.repository.ProductListRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getPromoNetworkStatus() {
        return null;
    }
    
    public final void setPromoNetworkStatus(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.lifecycle.LiveData<androidx.paging.PagedList<com.gibeom.ofriendsmobile.home.data.Product>> getTotalItems() {
        return null;
    }
    
    public final void setTotalItems(@org.jetbrains.annotations.Nullable()
    androidx.lifecycle.LiveData<androidx.paging.PagedList<com.gibeom.ofriendsmobile.home.data.Product>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getPromoNetworkStatus() {
        return null;
    }
    
    public final void setTotalItem(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getTotalItem() {
        return null;
    }
    
    public final void likeAction(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.home.data.Product product, int id) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gibeom.ofriendsmobile.repository.ProductListRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineScope getScope() {
        return null;
    }
    
    @javax.inject.Inject()
    public PromoViewModel(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.repository.ProductListRepository repository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
}