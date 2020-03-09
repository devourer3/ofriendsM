package com.gibeom.ofriendsmobile.databinding;
import com.gibeom.ofriendsmobile.R;
import com.gibeom.ofriendsmobile.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemCategoryBindingImpl extends ListItemCategoryBinding implements com.gibeom.ofriendsmobile.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.cLCatEntire, 3);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    @NonNull
    private final androidx.appcompat.widget.AppCompatTextView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ListItemCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[1]
            );
        this.iVCatImage.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.appcompat.widget.AppCompatTextView) bindings[2];
        this.mboundView2.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.gibeom.ofriendsmobile.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.homeVM == variableId) {
            setHomeVM((com.gibeom.ofriendsmobile.home.ui.HomeViewModel) variable);
        }
        else if (BR.category == variableId) {
            setCategory((com.gibeom.ofriendsmobile.home.data.Category) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeVM(@Nullable com.gibeom.ofriendsmobile.home.ui.HomeViewModel HomeVM) {
        this.mHomeVM = HomeVM;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.homeVM);
        super.requestRebind();
    }
    public void setCategory(@Nullable com.gibeom.ofriendsmobile.home.data.Category Category) {
        this.mCategory = Category;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.category);
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
        com.gibeom.ofriendsmobile.home.ui.HomeViewModel homeVM = mHomeVM;
        com.gibeom.ofriendsmobile.home.data.Category category = mCategory;
        java.lang.String categoryName = null;
        java.lang.String categoryImageUrl = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (category != null) {
                    // read category.name
                    categoryName = category.getName();
                    // read category.imageUrl
                    categoryImageUrl = category.getImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindImageFromUrl(this.iVCatImage, categoryImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, categoryName);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // homeVM
        com.gibeom.ofriendsmobile.home.ui.HomeViewModel homeVM = mHomeVM;
        // category.cat
        java.lang.String categoryCat = null;
        // category
        com.gibeom.ofriendsmobile.home.data.Category category = mCategory;
        // category.id
        int categoryId = 0;
        // homeVM != null
        boolean homeVMJavaLangObjectNull = false;
        // category != null
        boolean categoryJavaLangObjectNull = false;



        homeVMJavaLangObjectNull = (homeVM) != (null);
        if (homeVMJavaLangObjectNull) {



            categoryJavaLangObjectNull = (category) != (null);
            if (categoryJavaLangObjectNull) {


                categoryId = category.getId();



                categoryCat = category.getCat();

                homeVM.setSelectedMajorLifeTab(categoryId, categoryCat);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeVM
        flag 1 (0x2L): category
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}