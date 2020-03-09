package com.gibeom.ofriendsmobile.promo.ui;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 * Use the [PromoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J&\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u001c\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002J\u0012\u0010 \u001a\u00020\u00132\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006!"}, d2 = {"Lcom/gibeom/ofriendsmobile/promo/ui/PromoFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/gibeom/ofriendsmobile/di/Injectable;", "()V", "prAdapter", "Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeRisingAdapter;", "getPrAdapter", "()Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeRisingAdapter;", "prAdapter$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/gibeom/ofriendsmobile/promo/data/PromoViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setBind", "binding", "Lcom/gibeom/ofriendsmobile/databinding/FragmentPromoBinding;", "setListener", "subscribeUi", "app_release"})
public final class PromoFragment extends androidx.fragment.app.Fragment implements com.gibeom.ofriendsmobile.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.gibeom.ofriendsmobile.promo.data.PromoViewModel viewModel;
    private final kotlin.Lazy prAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.gibeom.ofriendsmobile.home.ui.adapter.LifeRisingAdapter getPrAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setListener(com.gibeom.ofriendsmobile.databinding.FragmentPromoBinding binding) {
    }
    
    private final void setBind(com.gibeom.ofriendsmobile.databinding.FragmentPromoBinding binding) {
    }
    
    private final void subscribeUi(com.gibeom.ofriendsmobile.databinding.FragmentPromoBinding binding) {
    }
    
    public PromoFragment() {
        super();
    }
}