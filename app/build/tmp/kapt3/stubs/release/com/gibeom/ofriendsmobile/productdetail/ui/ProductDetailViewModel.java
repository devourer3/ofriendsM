package com.gibeom.ofriendsmobile.productdetail.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0006J\b\u0010\u000f\u001a\u00020\nH\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/gibeom/ofriendsmobile/productdetail/ui/ProductDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/gibeom/ofriendsmobile/repository/ProductDetailRepository;", "(Lcom/gibeom/ofriendsmobile/repository/ProductDetailRepository;)V", "detailData", "Landroidx/lifecycle/LiveData;", "Lcom/gibeom/ofriendsmobile/data/Result;", "Lcom/gibeom/ofriendsmobile/productdetail/data/ProductDetail;", "getProductDetail", "", "id", "", "observeProduct", "Lcom/gibeom/ofriendsmobile/productdetail/data/ProductInfo;", "onCleared", "app_release"})
public final class ProductDetailViewModel extends androidx.lifecycle.ViewModel {
    private androidx.lifecycle.LiveData<com.gibeom.ofriendsmobile.data.Result<com.gibeom.ofriendsmobile.productdetail.data.ProductDetail>> detailData;
    private final com.gibeom.ofriendsmobile.repository.ProductDetailRepository repository = null;
    
    public final void getProductDetail(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.gibeom.ofriendsmobile.productdetail.data.ProductInfo> observeProduct() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @javax.inject.Inject()
    public ProductDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.gibeom.ofriendsmobile.repository.ProductDetailRepository repository) {
        super();
    }
}