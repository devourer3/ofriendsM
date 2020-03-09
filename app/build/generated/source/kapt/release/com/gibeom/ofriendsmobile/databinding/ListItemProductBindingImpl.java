package com.gibeom.ofriendsmobile.databinding;
import com.gibeom.ofriendsmobile.R;
import com.gibeom.ofriendsmobile.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemProductBindingImpl extends ListItemProductBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemProductBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ListItemProductBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatCheckBox) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            );
        this.cBLike.setTag(null);
        this.cLRiEntire.setTag(null);
        this.iVRiImage.setTag(null);
        this.tVRiCatchPhrase.setTag(null);
        this.tVRiPrice.setTag(null);
        this.tVRiTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.product == variableId) {
            setProduct((com.gibeom.ofriendsmobile.home.data.Product) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setProduct(@Nullable com.gibeom.ofriendsmobile.home.data.Product Product) {
        this.mProduct = Product;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.product);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Integer productLike = null;
        com.gibeom.ofriendsmobile.home.data.Product product = mProduct;
        java.lang.Integer productPrice = null;
        int androidxDatabindingViewDataBindingSafeUnboxProductPrice = 0;
        int androidxDatabindingViewDataBindingSafeUnboxProductLike = 0;
        java.lang.String productTitle = null;
        java.lang.String productImageLink = null;
        boolean productLikeInt0 = false;
        java.lang.String productCatchPhrase = null;
        boolean productLikeInt0BooleanTrueBooleanFalse = false;
        int productPriceInt0ViewGONEViewVISIBLE = 0;
        boolean productPriceInt0 = false;

        if ((dirtyFlags & 0x3L) != 0) {



                if (product != null) {
                    // read product.like
                    productLike = product.getLike();
                    // read product.price
                    productPrice = product.getPrice();
                    // read product.title
                    productTitle = product.getTitle();
                    // read product.image_link
                    productImageLink = product.getImage_link();
                    // read product.catchPhrase
                    productCatchPhrase = product.getCatchPhrase();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(product.like)
                androidxDatabindingViewDataBindingSafeUnboxProductLike = androidx.databinding.ViewDataBinding.safeUnbox(productLike);
                // read androidx.databinding.ViewDataBinding.safeUnbox(product.price)
                androidxDatabindingViewDataBindingSafeUnboxProductPrice = androidx.databinding.ViewDataBinding.safeUnbox(productPrice);


                // read androidx.databinding.ViewDataBinding.safeUnbox(product.like) > 0
                productLikeInt0 = (androidxDatabindingViewDataBindingSafeUnboxProductLike) > (0);
                // read androidx.databinding.ViewDataBinding.safeUnbox(product.price) == 0
                productPriceInt0 = (androidxDatabindingViewDataBindingSafeUnboxProductPrice) == (0);
            if((dirtyFlags & 0x3L) != 0) {
                if(productLikeInt0) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }
            if((dirtyFlags & 0x3L) != 0) {
                if(productPriceInt0) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(product.like) > 0 ? true : false
                productLikeInt0BooleanTrueBooleanFalse = ((productLikeInt0) ? (true) : (false));
                // read androidx.databinding.ViewDataBinding.safeUnbox(product.price) == 0 ? View.GONE : View.VISIBLE
                productPriceInt0ViewGONEViewVISIBLE = ((productPriceInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.cBLike, productLikeInt0BooleanTrueBooleanFalse);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindRadiusImageFromUrl(this.iVRiImage, productImageLink, 20);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tVRiCatchPhrase, productCatchPhrase);
            this.tVRiPrice.setVisibility(productPriceInt0ViewGONEViewVISIBLE);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindSetMoney(this.tVRiPrice, androidxDatabindingViewDataBindingSafeUnboxProductPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tVRiTitle, productTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): product
        flag 1 (0x2L): null
        flag 2 (0x3L): androidx.databinding.ViewDataBinding.safeUnbox(product.like) > 0 ? true : false
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(product.like) > 0 ? true : false
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(product.price) == 0 ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(product.price) == 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}