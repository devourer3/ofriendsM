package com.gibeom.ofriendsmobile.di

import com.gibeom.ofriendsmobile.home.ui.HomeFragment
import com.gibeom.ofriendsmobile.productdetail.ui.ProductDetailFragment
import com.gibeom.ofriendsmobile.promo.ui.PromoFragment
import com.gibeom.ofriendsmobile.like.ui.LikeFragment
import com.gibeom.ofriendsmobile.more.ui.MoreFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributeLikeFragment(): LikeFragment

    @ContributesAndroidInjector
    abstract fun contributeMoreFragment(): MoreFragment

    @ContributesAndroidInjector
    abstract fun contributePromoFragment(): PromoFragment

    @ContributesAndroidInjector
    abstract fun contributeProductDetailFragment(): ProductDetailFragment

}