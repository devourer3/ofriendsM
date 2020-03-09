package com.gibeom.ofriendsmobile.databinding;
import com.gibeom.ofriendsmobile.R;
import com.gibeom.ofriendsmobile.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProductDetailBindingImpl extends FragmentProductDetailBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(28);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_navigate"},
            new int[] {15},
            new int[] {com.gibeom.ofriendsmobile.R.layout.toolbar_navigate});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.wVEvent, 16);
        sViewsWithIds.put(R.id.gLToolbar, 17);
        sViewsWithIds.put(R.id.scVDetail, 18);
        sViewsWithIds.put(R.id.gLLeftMargin, 19);
        sViewsWithIds.put(R.id.gLRightMargin, 20);
        sViewsWithIds.put(R.id.vPDetailBanner, 21);
        sViewsWithIds.put(R.id.iVBorder1, 22);
        sViewsWithIds.put(R.id.tVSche, 23);
        sViewsWithIds.put(R.id.iVBorder2, 24);
        sViewsWithIds.put(R.id.tVHost, 25);
        sViewsWithIds.put(R.id.iVBorder3, 26);
        sViewsWithIds.put(R.id.tVHostReview, 27);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProductDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 28, sIncludes, sViewsWithIds));
    }
    private FragmentProductDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatButton) bindings[14]
            , (androidx.constraintlayout.widget.Guideline) bindings[19]
            , (androidx.constraintlayout.widget.Guideline) bindings[20]
            , (androidx.constraintlayout.widget.Guideline) bindings[17]
            , (com.gibeom.ofriendsmobile.databinding.ToolbarNavigateBinding) bindings[15]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[22]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[24]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[26]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[4]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[7]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[9]
            , (androidx.core.widget.NestedScrollView) bindings[18]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[25]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[27]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[23]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[10]
            , (androidx.viewpager.widget.ViewPager) bindings[21]
            , (android.webkit.WebView) bindings[16]
            );
        this.btnHostReview.setTag(null);
        this.iVHost.setTag(null);
        this.iVLike.setTag(null);
        this.iVLoc.setTag(null);
        this.iVSche.setTag(null);
        this.iVStar.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tVDeCatchPhrase.setTag(null);
        this.tVDePrice.setTag(null);
        this.tVDeTitle.setTag(null);
        this.tVHostDesc.setTag(null);
        this.tVHostName.setTag(null);
        this.tVLike.setTag(null);
        this.tVLoc.setTag(null);
        this.tVStar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        iCToolbar.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (iCToolbar.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vMDetail == variableId) {
            setVMDetail((com.gibeom.ofriendsmobile.productdetail.ui.ProductDetailViewModel) variable);
        }
        else if (BR.productInfo == variableId) {
            setProductInfo((com.gibeom.ofriendsmobile.productdetail.data.ProductInfo) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVMDetail(@Nullable com.gibeom.ofriendsmobile.productdetail.ui.ProductDetailViewModel VMDetail) {
        this.mVMDetail = VMDetail;
    }
    public void setProductInfo(@Nullable com.gibeom.ofriendsmobile.productdetail.data.ProductInfo ProductInfo) {
        this.mProductInfo = ProductInfo;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.productInfo);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        iCToolbar.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeICToolbar((com.gibeom.ofriendsmobile.databinding.ToolbarNavigateBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeICToolbar(com.gibeom.ofriendsmobile.databinding.ToolbarNavigateBinding ICToolbar, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.lang.String productInfoHostTitle = null;
        java.lang.String productInfoCatchPhrase = null;
        java.lang.String productInfoHostBody = null;
        int productInfoHostLikes = 0;
        java.lang.String productInfoTitle = null;
        com.gibeom.ofriendsmobile.productdetail.data.ProductInfo productInfo = mProductInfo;
        int productInfoPrice = 0;
        java.lang.String productInfoHostImageUrl = null;
        int productInfoLikes = 0;
        int productInfoRating = 0;
        java.lang.String productInfoLocation = null;

        if ((dirtyFlags & 0xcL) != 0) {



                if (productInfo != null) {
                    // read productInfo.host_title
                    productInfoHostTitle = productInfo.getHost_title();
                    // read productInfo.catch_phrase
                    productInfoCatchPhrase = productInfo.getCatch_phrase();
                    // read productInfo.host_body
                    productInfoHostBody = productInfo.getHost_body();
                    // read productInfo.host_likes
                    productInfoHostLikes = productInfo.getHost_likes();
                    // read productInfo.title
                    productInfoTitle = productInfo.getTitle();
                    // read productInfo.price
                    productInfoPrice = productInfo.getPrice();
                    // read productInfo.host_image_url
                    productInfoHostImageUrl = productInfo.getHost_image_url();
                    // read productInfo.likes
                    productInfoLikes = productInfo.getLikes();
                    // read productInfo.rating
                    productInfoRating = productInfo.getRating();
                    // read productInfo.location
                    productInfoLocation = productInfo.getLocation();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextFormat(this.btnHostReview, "S0005", productInfoHostLikes, (java.lang.Object)null);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindRadiusImageFromUrl(this.iVHost, productInfoHostImageUrl, 100);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tVDeCatchPhrase, productInfoCatchPhrase);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindSetMoney(this.tVDePrice, productInfoPrice);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tVDeTitle, productInfoTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tVHostDesc, productInfoHostBody);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tVHostName, productInfoHostTitle);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextFormat(this.tVLike, "S0002", productInfoLikes, (java.lang.Object)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tVLoc, productInfoLocation);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextFormat(this.tVStar, "S0004", productInfoRating, (java.lang.Object)null);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindImageFromUrl(this.iVLike, "https://gibeomport.s3.ap-northeast-2.amazonaws.com/portimage/android/ofriends/detail_like.png");
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindImageFromUrl(this.iVLoc, "https://gibeomport.s3.ap-northeast-2.amazonaws.com/portimage/android/ofriends/detail_location.png");
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindImageFromUrl(this.iVSche, "https://gibeomport.s3.ap-northeast-2.amazonaws.com/portimage/android/ofriends/detail_calendar.png");
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindImageFromUrl(this.iVStar, "https://gibeomport.s3.ap-northeast-2.amazonaws.com/portimage/android/ofriends/detail_star.png");
        }
        executeBindingsOn(iCToolbar);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): iCToolbar
        flag 1 (0x2L): vMDetail
        flag 2 (0x3L): productInfo
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}