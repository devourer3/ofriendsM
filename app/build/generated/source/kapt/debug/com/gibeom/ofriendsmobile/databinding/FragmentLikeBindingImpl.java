package com.gibeom.ofriendsmobile.databinding;
import com.gibeom.ofriendsmobile.R;
import com.gibeom.ofriendsmobile.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLikeBindingImpl extends FragmentLikeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(2, 
            new String[] {"nocontent"},
            new int[] {4},
            new int[] {com.gibeom.ofriendsmobile.R.layout.nocontent});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.gLLeftMargin, 5);
        sViewsWithIds.put(R.id.gLRightMargin, 6);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentLikeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentLikeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (com.gibeom.ofriendsmobile.databinding.NocontentBinding) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.FrameLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.rVLike.setTag(null);
        this.tVLikeLife.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        iCNoContent.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (iCNoContent.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.total == variableId) {
            setTotal((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTotal(@Nullable java.lang.Integer Total) {
        this.mTotal = Total;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.total);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        iCNoContent.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeICNoContent((com.gibeom.ofriendsmobile.databinding.NocontentBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeICNoContent(com.gibeom.ofriendsmobile.databinding.NocontentBinding ICNoContent, int fieldId) {
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
        int totalInt0ViewVISIBLEViewGONE = 0;
        int totalInt0ViewGONEViewVISIBLE = 0;
        boolean totalInt0 = false;
        java.lang.Integer total = mTotal;
        int androidxDatabindingViewDataBindingSafeUnboxTotal = 0;

        if ((dirtyFlags & 0x6L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(total)
                androidxDatabindingViewDataBindingSafeUnboxTotal = androidx.databinding.ViewDataBinding.safeUnbox(total);


                // read androidx.databinding.ViewDataBinding.safeUnbox(total) == 0
                totalInt0 = (androidxDatabindingViewDataBindingSafeUnboxTotal) == (0);
            if((dirtyFlags & 0x6L) != 0) {
                if(totalInt0) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(total) == 0 ? View.VISIBLE : View.GONE
                totalInt0ViewVISIBLEViewGONE = ((totalInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read androidx.databinding.ViewDataBinding.safeUnbox(total) == 0 ? View.GONE : View.VISIBLE
                totalInt0ViewGONEViewVISIBLE = ((totalInt0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.iCNoContent.getRoot().setVisibility(totalInt0ViewVISIBLEViewGONE);
            this.rVLike.setVisibility(totalInt0ViewGONEViewVISIBLE);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextFormat(this.tVLikeLife, "S0008", total, (java.lang.Object)null);
        }
        executeBindingsOn(iCNoContent);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): iCNoContent
        flag 1 (0x2L): total
        flag 2 (0x3L): null
        flag 3 (0x4L): androidx.databinding.ViewDataBinding.safeUnbox(total) == 0 ? View.VISIBLE : View.GONE
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(total) == 0 ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(total) == 0 ? View.GONE : View.VISIBLE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(total) == 0 ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}