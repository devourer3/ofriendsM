package com.gibeom.ofriendsmobile.databinding;
import com.gibeom.ofriendsmobile.R;
import com.gibeom.ofriendsmobile.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class AwesomeBindingImpl extends AwesomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.vPMainBanner, 3);
        sViewsWithIds.put(R.id.tLIndicator, 4);
        sViewsWithIds.put(R.id.rVCategory, 5);
        sViewsWithIds.put(R.id.tVRisingLife, 6);
        sViewsWithIds.put(R.id.tVRiseEntire, 7);
        sViewsWithIds.put(R.id.rVRisingLife, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public AwesomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private AwesomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ProgressBar) bindings[1]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[5]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (com.google.android.material.tabs.TabLayout) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.viewpager.widget.ViewPager) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pBMainBanner.setTag(null);
        this.pBRisingPrd.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.vmHome == variableId) {
            setVmHome((com.gibeom.ofriendsmobile.home.ui.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVmHome(@Nullable com.gibeom.ofriendsmobile.home.ui.HomeViewModel VmHome) {
        this.mVmHome = VmHome;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vmHome);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmHomeGetAwesomeNetworkStatus((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmHomeGetAwesomeNetworkStatus(androidx.lifecycle.LiveData<java.lang.String> VmHomeGetAwesomeNetworkStatus, int fieldId) {
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
        androidx.lifecycle.LiveData<java.lang.String> vmHomeGetAwesomeNetworkStatus = null;
        java.lang.String vmHomeGetAwesomeNetworkStatusGetValue = null;
        com.gibeom.ofriendsmobile.home.ui.HomeViewModel vmHome = mVmHome;

        if ((dirtyFlags & 0x7L) != 0) {



                if (vmHome != null) {
                    // read vmHome.getAwesomeNetworkStatus()
                    vmHomeGetAwesomeNetworkStatus = vmHome.getAwesomeNetworkStatus();
                }
                updateLiveDataRegistration(0, vmHomeGetAwesomeNetworkStatus);


                if (vmHomeGetAwesomeNetworkStatus != null) {
                    // read vmHome.getAwesomeNetworkStatus().getValue()
                    vmHomeGetAwesomeNetworkStatusGetValue = vmHomeGetAwesomeNetworkStatus.getValue();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindLoading(this.pBMainBanner, vmHomeGetAwesomeNetworkStatusGetValue);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindLoading(this.pBRisingPrd, vmHomeGetAwesomeNetworkStatusGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vmHome.getAwesomeNetworkStatus()
        flag 1 (0x2L): vmHome
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}