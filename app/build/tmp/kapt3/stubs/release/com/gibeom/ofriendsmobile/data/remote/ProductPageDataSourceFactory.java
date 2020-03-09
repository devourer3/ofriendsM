package com.gibeom.ofriendsmobile.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016BC\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0015H\u0016R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/gibeom/ofriendsmobile/data/remote/ProductPageDataSourceFactory;", "Landroidx/paging/DataSource$Factory;", "", "Lcom/gibeom/ofriendsmobile/home/data/Product;", "query", "", "dataSource", "Lcom/gibeom/ofriendsmobile/data/remote/ProductListRemoteDataSource;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "promoViewModel", "Lcom/gibeom/ofriendsmobile/promo/data/PromoViewModel;", "homeViewModel", "Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;", "dao", "Lcom/gibeom/ofriendsmobile/data/local/OfriendsDao;", "(Ljava/lang/String;Lcom/gibeom/ofriendsmobile/data/remote/ProductListRemoteDataSource;Lkotlinx/coroutines/CoroutineScope;Lcom/gibeom/ofriendsmobile/promo/data/PromoViewModel;Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;Lcom/gibeom/ofriendsmobile/data/local/OfriendsDao;)V", "liveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/gibeom/ofriendsmobile/data/remote/ProductPageDataSource;", "create", "Landroidx/paging/DataSource;", "Companion", "app_release"})
public final class ProductPageDataSourceFactory extends androidx.paging.DataSource.Factory<java.lang.Integer, com.gibeom.ofriendsmobile.home.data.Product> {
    private final androidx.lifecycle.MutableLiveData<com.gibeom.ofriendsmobile.data.remote.ProductPageDataSource> liveData = null;
    private final java.lang.String query = null;
    private final com.gibeom.ofriendsmobile.data.remote.ProductListRemoteDataSource dataSource = null;
    private final kotlinx.coroutines.CoroutineScope scope = null;
    private final com.gibeom.ofriendsmobile.promo.data.PromoViewModel promoViewModel = null;
    private final com.gibeom.ofriendsmobile.home.ui.HomeViewModel homeViewModel = null;
    private final com.gibeom.ofriendsmobile.data.local.OfriendsDao dao = null;
    private static final int PAGE_SIZE = 20;
    public static final com.gibeom.ofriendsmobile.data.remote.ProductPageDataSourceFactory.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.paging.DataSource<java.lang.Integer, com.gibeom.ofriendsmobile.home.data.Product> create() {
        return null;
    }
    
    @javax.inject.Inject()
    public ProductPageDataSourceFactory(@org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.data.remote.ProductListRemoteDataSource dataSource, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope scope, @org.jetbrains.annotations.Nullable()
    com.gibeom.ofriendsmobile.promo.data.PromoViewModel promoViewModel, @org.jetbrains.annotations.Nullable()
    com.gibeom.ofriendsmobile.home.ui.HomeViewModel homeViewModel, @org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.data.local.OfriendsDao dao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/gibeom/ofriendsmobile/data/remote/ProductPageDataSourceFactory$Companion;", "", "()V", "PAGE_SIZE", "", "pagedListConfig", "Landroidx/paging/PagedList$Config;", "app_release"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.paging.PagedList.Config pagedListConfig() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}