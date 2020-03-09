package com.gibeom.ofriendsmobile.like.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u00020\n2\n\u0010\u000b\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\f\u001a\u00020\rH\u0016J\u001c\u0010\u000e\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/gibeom/ofriendsmobile/like/ui/adapter/LikeProductAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/gibeom/ofriendsmobile/home/data/Product;", "Lcom/gibeom/ofriendsmobile/like/ui/adapter/LikeProductAdapter$LikeProductViewHolder;", "viewModel", "Lcom/gibeom/ofriendsmobile/like/ui/LikeViewModel;", "(Lcom/gibeom/ofriendsmobile/like/ui/LikeViewModel;)V", "getViewModel", "()Lcom/gibeom/ofriendsmobile/like/ui/LikeViewModel;", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "LikeProductViewHolder", "app_release"})
public final class LikeProductAdapter extends androidx.recyclerview.widget.ListAdapter<com.gibeom.ofriendsmobile.home.data.Product, com.gibeom.ofriendsmobile.like.ui.adapter.LikeProductAdapter.LikeProductViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.gibeom.ofriendsmobile.like.ui.LikeViewModel viewModel = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.gibeom.ofriendsmobile.like.ui.adapter.LikeProductAdapter.LikeProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.like.ui.adapter.LikeProductAdapter.LikeProductViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gibeom.ofriendsmobile.like.ui.LikeViewModel getViewModel() {
        return null;
    }
    
    public LikeProductAdapter(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.like.ui.LikeViewModel viewModel) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/gibeom/ofriendsmobile/like/ui/adapter/LikeProductAdapter$LikeProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/gibeom/ofriendsmobile/databinding/ListItemProductBinding;", "(Lcom/gibeom/ofriendsmobile/like/ui/adapter/LikeProductAdapter;Lcom/gibeom/ofriendsmobile/databinding/ListItemProductBinding;)V", "bind", "", "item", "Lcom/gibeom/ofriendsmobile/home/data/Product;", "app_release"})
    public final class LikeProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.gibeom.ofriendsmobile.databinding.ListItemProductBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.gibeom.ofriendsmobile.home.data.Product item) {
        }
        
        public LikeProductViewHolder(@org.jetbrains.annotations.NotNull()
        com.gibeom.ofriendsmobile.databinding.ListItemProductBinding binding) {
            super(null);
        }
    }
}