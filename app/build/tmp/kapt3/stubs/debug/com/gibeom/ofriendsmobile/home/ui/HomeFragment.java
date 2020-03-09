package com.gibeom.ofriendsmobile.home.ui;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [HomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010)\u001a\u00020*H\u0002J\u0012\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J&\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u0001032\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00104\u001a\u00020*H\u0016J\b\u00105\u001a\u00020*H\u0002J\b\u00106\u001a\u00020*H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010\u000e\u001a\u0004\b\u001f\u0010\u0012R\u000e\u0010!\u001a\u00020\"X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010#\u001a\u00020$8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(\u00a8\u00067"}, d2 = {"Lcom/gibeom/ofriendsmobile/home/ui/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/gibeom/ofriendsmobile/di/Injectable;", "()V", "binding", "Lcom/gibeom/ofriendsmobile/databinding/FragmentHomeBinding;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "cAdapter", "Lcom/gibeom/ofriendsmobile/home/ui/adapter/CategoryAdapter;", "getCAdapter", "()Lcom/gibeom/ofriendsmobile/home/ui/adapter/CategoryAdapter;", "cAdapter$delegate", "Lkotlin/Lazy;", "lAdapter", "Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeRisingAdapter;", "getLAdapter", "()Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeRisingAdapter;", "lAdapter$delegate", "lLAdatper", "Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeCategoryAdapter;", "getLLAdatper", "()Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeCategoryAdapter;", "lLAdatper$delegate", "rAdapterAwesome", "Lcom/gibeom/ofriendsmobile/home/ui/adapter/AwesomeRisingAdapter;", "getRAdapterAwesome", "()Lcom/gibeom/ofriendsmobile/home/ui/adapter/AwesomeRisingAdapter;", "rAdapterAwesome$delegate", "sAdapter", "getSAdapter", "sAdapter$delegate", "viewModel", "Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "bind", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "setListener", "subscribeUi", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements com.gibeom.ofriendsmobile.di.Injectable {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.gibeom.ofriendsmobile.home.ui.HomeViewModel viewModel;
    private com.gibeom.ofriendsmobile.databinding.FragmentHomeBinding binding;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<androidx.constraintlayout.widget.ConstraintLayout> bottomSheetBehavior;
    private final kotlin.Lazy cAdapter$delegate = null;
    private final kotlin.Lazy lLAdatper$delegate = null;
    private final kotlin.Lazy rAdapterAwesome$delegate = null;
    private final kotlin.Lazy lAdapter$delegate = null;
    private final kotlin.Lazy sAdapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    private final com.gibeom.ofriendsmobile.home.ui.adapter.CategoryAdapter getCAdapter() {
        return null;
    }
    
    private final com.gibeom.ofriendsmobile.home.ui.adapter.LifeCategoryAdapter getLLAdatper() {
        return null;
    }
    
    private final com.gibeom.ofriendsmobile.home.ui.adapter.AwesomeRisingAdapter getRAdapterAwesome() {
        return null;
    }
    
    private final com.gibeom.ofriendsmobile.home.ui.adapter.LifeRisingAdapter getLAdapter() {
        return null;
    }
    
    private final com.gibeom.ofriendsmobile.home.ui.adapter.LifeRisingAdapter getSAdapter() {
        return null;
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
    
    private final void setListener() {
    }
    
    private final void subscribeUi() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public HomeFragment() {
        super();
    }
}