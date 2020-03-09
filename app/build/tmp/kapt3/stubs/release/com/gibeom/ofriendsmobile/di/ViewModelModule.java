package com.gibeom.ofriendsmobile.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/gibeom/ofriendsmobile/di/ViewModelModule;", "", "()V", "bindHomeViewModel", "Landroidx/lifecycle/ViewModel;", "viewModel", "Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;", "bindLikeViewModel", "Lcom/gibeom/ofriendsmobile/like/ui/LikeViewModel;", "bindProductDetailViewModel", "Lcom/gibeom/ofriendsmobile/productdetail/ui/ProductDetailViewModel;", "bindPromoViewModel", "Lcom/gibeom/ofriendsmobile/promo/data/PromoViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/gibeom/ofriendsmobile/di/ViewModelFactory;", "app_release"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.gibeom.ofriendsmobile.home.ui.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHomeViewModel(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.home.ui.HomeViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.gibeom.ofriendsmobile.promo.data.PromoViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindPromoViewModel(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.promo.data.PromoViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.gibeom.ofriendsmobile.productdetail.ui.ProductDetailViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindProductDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.productdetail.ui.ProductDetailViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.gibeom.ofriendsmobile.like.ui.LikeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindLikeViewModel(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.like.ui.LikeViewModel viewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.di.ViewModelFactory factory);
    
    public ViewModelModule() {
        super();
    }
}