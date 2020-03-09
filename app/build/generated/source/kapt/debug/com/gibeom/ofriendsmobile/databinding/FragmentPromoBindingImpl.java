package com.gibeom.ofriendsmobile.databinding;
import com.gibeom.ofriendsmobile.R;
import com.gibeom.ofriendsmobile.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPromoBindingImpl extends FragmentPromoBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(5);
        sIncludes.setIncludes(0, 
            new String[] {"toolbar_navigate"},
            new int[] {2},
            new int[] {com.gibeom.ofriendsmobile.R.layout.toolbar_navigate});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.gLToolbar, 3);
        sViewsWithIds.put(R.id.rVPromo, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ProgressBar mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPromoBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentPromoBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.Guideline) bindings[3]
            , (com.gibeom.ofriendsmobile.databinding.ToolbarNavigateBinding) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ProgressBar) bindings[1];
        this.mboundView1.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        iCPromoTB.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (iCPromoTB.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vMPr == variableId) {
            setVMPr((com.gibeom.ofriendsmobile.promo.data.PromoViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVMPr(@Nullable com.gibeom.ofriendsmobile.promo.data.PromoViewModel VMPr) {
        this.mVMPr = VMPr;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vMPr);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        iCPromoTB.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVMPrGetPromoNetworkStatus((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeICPromoTB((com.gibeom.ofriendsmobile.databinding.ToolbarNavigateBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVMPrGetPromoNetworkStatus(androidx.lifecycle.MutableLiveData<java.lang.String> VMPrGetPromoNetworkStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeICPromoTB(com.gibeom.ofriendsmobile.databinding.ToolbarNavigateBinding ICPromoTB, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        androidx.lifecycle.MutableLiveData<java.lang.String> vMPrGetPromoNetworkStatus = null;
        com.gibeom.ofriendsmobile.promo.data.PromoViewModel vMPr = mVMPr;
        java.lang.String vMPrGetPromoNetworkStatusGetValue = null;

        if ((dirtyFlags & 0xdL) != 0) {



                if (vMPr != null) {
                    // read vMPr.getPromoNetworkStatus
                    vMPrGetPromoNetworkStatus = vMPr.getPromoNetworkStatus();
                }
                updateLiveDataRegistration(0, vMPrGetPromoNetworkStatus);


                if (vMPrGetPromoNetworkStatus != null) {
                    // read vMPr.getPromoNetworkStatus.getValue()
                    vMPrGetPromoNetworkStatusGetValue = vMPrGetPromoNetworkStatus.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindLoading(this.mboundView1, vMPrGetPromoNetworkStatusGetValue);
        }
        executeBindingsOn(iCPromoTB);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vMPr.getPromoNetworkStatus
        flag 1 (0x2L): iCPromoTB
        flag 2 (0x3L): vMPr
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}