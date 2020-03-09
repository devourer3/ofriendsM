package com.gibeom.ofriendsmobile.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'J\b\u0010\t\u001a\u00020\nH\'J\b\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/gibeom/ofriendsmobile/di/FragmentBuildersModule;", "", "()V", "contributeHomeFragment", "Lcom/gibeom/ofriendsmobile/home/ui/HomeFragment;", "contributeLikeFragment", "Lcom/gibeom/ofriendsmobile/like/ui/LikeFragment;", "contributeMoreFragment", "Lcom/gibeom/ofriendsmobile/more/ui/MoreFragment;", "contributeProductDetailFragment", "Lcom/gibeom/ofriendsmobile/productdetail/ui/ProductDetailFragment;", "contributePromoFragment", "Lcom/gibeom/ofriendsmobile/promo/ui/PromoFragment;", "app_release"})
@dagger.Module()
public abstract class FragmentBuildersModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.gibeom.ofriendsmobile.home.ui.HomeFragment contributeHomeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.gibeom.ofriendsmobile.like.ui.LikeFragment contributeLikeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.gibeom.ofriendsmobile.more.ui.MoreFragment contributeMoreFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.gibeom.ofriendsmobile.promo.ui.PromoFragment contributePromoFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.gibeom.ofriendsmobile.productdetail.ui.ProductDetailFragment contributeProductDetailFragment();
    
    public FragmentBuildersModule() {
        super();
    }
}