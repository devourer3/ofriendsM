package com.gibeom.ofriendsmobile.like.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\b\u0010\u000f\u001a\u00020\bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/gibeom/ofriendsmobile/like/ui/LikeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/gibeom/ofriendsmobile/repository/ProductListRepository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/gibeom/ofriendsmobile/repository/ProductListRepository;Lkotlinx/coroutines/CoroutineScope;)V", "deleteLike", "", "id", "", "observeLocalProduct", "Landroidx/lifecycle/LiveData;", "", "Lcom/gibeom/ofriendsmobile/home/data/Product;", "onCleared", "app_debug"})
public final class LikeViewModel extends androidx.lifecycle.ViewModel {
    private final com.gibeom.ofriendsmobile.repository.ProductListRepository repository = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.gibeom.ofriendsmobile.home.data.Product>> observeLocalProduct() {
        return null;
    }
    
    public final void deleteLike(int id) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public LikeViewModel(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.repository.ProductListRepository repository, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope) {
        super();
    }
}