package com.gibeom.ofriendsmobile.home.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/gibeom/ofriendsmobile/home/ui/adapter/CategoryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/gibeom/ofriendsmobile/home/data/Category;", "Lcom/gibeom/ofriendsmobile/home/ui/adapter/CategoryAdapter$ViewHolder;", "viewModel", "Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;", "(Lcom/gibeom/ofriendsmobile/home/ui/HomeViewModel;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"})
public final class CategoryAdapter extends androidx.recyclerview.widget.ListAdapter<com.gibeom.ofriendsmobile.home.data.Category, com.gibeom.ofriendsmobile.home.ui.adapter.CategoryAdapter.ViewHolder> {
    private final com.gibeom.ofriendsmobile.home.ui.HomeViewModel viewModel = null;
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.home.ui.adapter.CategoryAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.gibeom.ofriendsmobile.home.ui.adapter.CategoryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @javax.inject.Inject()
    public CategoryAdapter(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.home.ui.HomeViewModel viewModel) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/gibeom/ofriendsmobile/home/ui/adapter/CategoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/gibeom/ofriendsmobile/databinding/ListItemCategoryBinding;", "(Lcom/gibeom/ofriendsmobile/home/ui/adapter/CategoryAdapter;Lcom/gibeom/ofriendsmobile/databinding/ListItemCategoryBinding;)V", "bind", "", "item", "Lcom/gibeom/ofriendsmobile/home/data/Category;", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.gibeom.ofriendsmobile.databinding.ListItemCategoryBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.gibeom.ofriendsmobile.home.data.Category item) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.gibeom.ofriendsmobile.databinding.ListItemCategoryBinding binding) {
            super(null);
        }
    }
}