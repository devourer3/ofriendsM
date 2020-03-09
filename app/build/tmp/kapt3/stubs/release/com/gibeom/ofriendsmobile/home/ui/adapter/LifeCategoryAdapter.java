package com.gibeom.ofriendsmobile.home.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeCategoryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/gibeom/ofriendsmobile/home/data/LifeCategory;", "Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeCategoryAdapter$ViewHolder;", "viewModel", "Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;", "(Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;)V", "getViewModel", "()Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class LifeCategoryAdapter extends androidx.recyclerview.widget.ListAdapter<com.gibeom.ofriendsmobile.home.data.LifeCategory, com.gibeom.ofriendsmobile.home.ui.adapter.LifeCategoryAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.gibeom.ofriendsmobile.home.ui.HomeViewModel viewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.gibeom.ofriendsmobile.home.ui.adapter.LifeCategoryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.home.ui.adapter.LifeCategoryAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gibeom.ofriendsmobile.home.ui.HomeViewModel getViewModel() {
        return null;
    }
    
    public LifeCategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.home.ui.HomeViewModel viewModel) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeCategoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/gibeom/ofriendsmobile/databinding/ListItemLifeCategoryBinding;", "(Lcom/gibeom/ofriendsmobile/home/ui/adapter/LifeCategoryAdapter;Lcom/gibeom/ofriendsmobile/databinding/ListItemLifeCategoryBinding;)V", "bind", "", "item", "Lcom/gibeom/ofriendsmobile/home/data/LifeCategory;", "position", "", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.gibeom.ofriendsmobile.databinding.ListItemLifeCategoryBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.gibeom.ofriendsmobile.home.data.LifeCategory item, int position) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.gibeom.ofriendsmobile.databinding.ListItemLifeCategoryBinding binding) {
            super(null);
        }
    }
}