package com.gibeom.ofriendsmobile.productdetail.ui;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 * Use the [ProductDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u0012\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0012\u0010%\u001a\u00020\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u000bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006("}, d2 = {"Lcom/gibeom/ofriendsmobile/productdetail/ui/ProductDetailFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/gibeom/ofriendsmobile/di/Injectable;", "()V", "args", "Lcom/gibeom/ofriendsmobile/productdetail/ui/ProductDetailFragmentArgs;", "getArgs", "()Lcom/gibeom/ofriendsmobile/productdetail/ui/ProductDetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/gibeom/ofriendsmobile/databinding/FragmentProductDetailBinding;", "isInternal", "", "()Z", "isInternal$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/gibeom/ofriendsmobile/productdetail/ui/ProductDetailViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "bind", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "setListener", "subscribeUi", "MyWebClient", "app_debug"})
public final class ProductDetailFragment extends androidx.fragment.app.Fragment implements com.gibeom.ofriendsmobile.di.Injectable {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private final kotlin.Lazy isInternal$delegate = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.gibeom.ofriendsmobile.productdetail.ui.ProductDetailViewModel viewModel;
    private com.gibeom.ofriendsmobile.databinding.FragmentProductDetailBinding binding;
    private java.util.HashMap _$_findViewCache;
    
    private final com.gibeom.ofriendsmobile.productdetail.ui.ProductDetailFragmentArgs getArgs() {
        return null;
    }
    
    private final boolean isInternal() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
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
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bind() {
    }
    
    private final void setListener(com.gibeom.ofriendsmobile.databinding.FragmentProductDetailBinding binding) {
    }
    
    private final void subscribeUi(com.gibeom.ofriendsmobile.databinding.FragmentProductDetailBinding binding) {
    }
    
    public ProductDetailFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016\u00a8\u0006\t"}, d2 = {"Lcom/gibeom/ofriendsmobile/productdetail/ui/ProductDetailFragment$MyWebClient;", "Landroid/webkit/WebViewClient;", "()V", "shouldOverrideUrlLoading", "", "view", "Landroid/webkit/WebView;", "request", "Landroid/webkit/WebResourceRequest;", "app_debug"})
    static final class MyWebClient extends android.webkit.WebViewClient {
        
        @java.lang.Override()
        public boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.Nullable()
        android.webkit.WebView view, @org.jetbrains.annotations.Nullable()
        android.webkit.WebResourceRequest request) {
            return false;
        }
        
        public MyWebClient() {
            super();
        }
    }
}