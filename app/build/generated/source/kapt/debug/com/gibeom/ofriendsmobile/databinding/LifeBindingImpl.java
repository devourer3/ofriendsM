package com.gibeom.ofriendsmobile.databinding;
import com.gibeom.ofriendsmobile.R;
import com.gibeom.ofriendsmobile.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LifeBindingImpl extends LifeBinding implements com.gibeom.ofriendsmobile.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iVBackground, 5);
        sViewsWithIds.put(R.id.rVLifeList, 6);
        sViewsWithIds.put(R.id.rVFilteredPrd, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LifeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private LifeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ProgressBar) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[7]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pBFilteredPrd.setTag(null);
        this.tVCoWorking.setTag(null);
        this.tVLearning.setTag(null);
        this.tVPlaying.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.gibeom.ofriendsmobile.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.gibeom.ofriendsmobile.generated.callback.OnClickListener(this, 3);
        mCallback3 = new com.gibeom.ofriendsmobile.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vmHome);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmHomeSelectedLifeMajorTab((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 1 :
                return onChangeVmHomeGetLifeNetworkStatus((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmHomeSelectedLifeMajorTab(androidx.lifecycle.MutableLiveData<java.lang.Integer> VmHomeSelectedLifeMajorTab, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmHomeGetLifeNetworkStatus(androidx.lifecycle.MutableLiveData<java.lang.String> VmHomeGetLifeNetworkStatus, int fieldId) {
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
        androidx.lifecycle.MutableLiveData<java.lang.Integer> vmHomeSelectedLifeMajorTab = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> vmHomeGetLifeNetworkStatus = null;
        java.lang.Integer vmHomeSelectedLifeMajorTabGetValue = null;
        boolean vmHomeSelectedLifeMajorTabInt2BooleanTrueBooleanFalse = false;
        boolean vmHomeSelectedLifeMajorTabInt1 = false;
        boolean vmHomeSelectedLifeMajorTabInt0BooleanTrueBooleanFalse = false;
        java.lang.String vmHomeSelectedLifeMajorTabInt0JavaLangStringBoldJavaLangStringNormal = null;
        java.lang.String vmHomeSelectedLifeMajorTabInt1JavaLangStringBoldJavaLangStringNormal = null;
        java.lang.String vmHomeSelectedLifeMajorTabInt2JavaLangStringBoldJavaLangStringNormal = null;
        java.lang.String vmHomeGetLifeNetworkStatusGetValue = null;
        int androidxDatabindingViewDataBindingSafeUnboxVmHomeSelectedLifeMajorTabGetValue = 0;
        boolean vmHomeSelectedLifeMajorTabInt2 = false;
        boolean vmHomeSelectedLifeMajorTabInt1BooleanTrueBooleanFalse = false;
        boolean vmHomeSelectedLifeMajorTabInt0 = false;
        com.gibeom.ofriendsmobile.home.ui.HomeViewModel vmHome = mVmHome;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vmHome != null) {
                        // read vmHome.selectedLifeMajorTab
                        vmHomeSelectedLifeMajorTab = vmHome.getSelectedLifeMajorTab();
                    }
                    updateLiveDataRegistration(0, vmHomeSelectedLifeMajorTab);


                    if (vmHomeSelectedLifeMajorTab != null) {
                        // read vmHome.selectedLifeMajorTab.getValue()
                        vmHomeSelectedLifeMajorTabGetValue = vmHomeSelectedLifeMajorTab.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxVmHomeSelectedLifeMajorTabGetValue = androidx.databinding.ViewDataBinding.safeUnbox(vmHomeSelectedLifeMajorTabGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 1
                    vmHomeSelectedLifeMajorTabInt1 = (androidxDatabindingViewDataBindingSafeUnboxVmHomeSelectedLifeMajorTabGetValue) == (1);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 2
                    vmHomeSelectedLifeMajorTabInt2 = (androidxDatabindingViewDataBindingSafeUnboxVmHomeSelectedLifeMajorTabGetValue) == (2);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 0
                    vmHomeSelectedLifeMajorTabInt0 = (androidxDatabindingViewDataBindingSafeUnboxVmHomeSelectedLifeMajorTabGetValue) == (0);
                if((dirtyFlags & 0xdL) != 0) {
                    if(vmHomeSelectedLifeMajorTabInt1) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x4000L;
                    }
                }
                if((dirtyFlags & 0xdL) != 0) {
                    if(vmHomeSelectedLifeMajorTabInt2) {
                            dirtyFlags |= 0x20L;
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                            dirtyFlags |= 0x1000L;
                    }
                }
                if((dirtyFlags & 0xdL) != 0) {
                    if(vmHomeSelectedLifeMajorTabInt0) {
                            dirtyFlags |= 0x80L;
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 1 ? "bold" : "normal"
                    vmHomeSelectedLifeMajorTabInt1JavaLangStringBoldJavaLangStringNormal = ((vmHomeSelectedLifeMajorTabInt1) ? ("bold") : ("normal"));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 1 ? true : false
                    vmHomeSelectedLifeMajorTabInt1BooleanTrueBooleanFalse = ((vmHomeSelectedLifeMajorTabInt1) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 2 ? true : false
                    vmHomeSelectedLifeMajorTabInt2BooleanTrueBooleanFalse = ((vmHomeSelectedLifeMajorTabInt2) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 2 ? "bold" : "normal"
                    vmHomeSelectedLifeMajorTabInt2JavaLangStringBoldJavaLangStringNormal = ((vmHomeSelectedLifeMajorTabInt2) ? ("bold") : ("normal"));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 0 ? true : false
                    vmHomeSelectedLifeMajorTabInt0BooleanTrueBooleanFalse = ((vmHomeSelectedLifeMajorTabInt0) ? (true) : (false));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 0 ? "bold" : "normal"
                    vmHomeSelectedLifeMajorTabInt0JavaLangStringBoldJavaLangStringNormal = ((vmHomeSelectedLifeMajorTabInt0) ? ("bold") : ("normal"));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vmHome != null) {
                        // read vmHome.getLifeNetworkStatus
                        vmHomeGetLifeNetworkStatus = vmHome.getLifeNetworkStatus();
                    }
                    updateLiveDataRegistration(1, vmHomeGetLifeNetworkStatus);


                    if (vmHomeGetLifeNetworkStatus != null) {
                        // read vmHome.getLifeNetworkStatus.getValue()
                        vmHomeGetLifeNetworkStatusGetValue = vmHomeGetLifeNetworkStatus.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindLoading(this.pBFilteredPrd, vmHomeGetLifeNetworkStatusGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.tVCoWorking.setOnClickListener(mCallback5);
            this.tVLearning.setOnClickListener(mCallback4);
            this.tVPlaying.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindBorderBackground(this.tVCoWorking, vmHomeSelectedLifeMajorTabInt2BooleanTrueBooleanFalse);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextStyle(this.tVCoWorking, vmHomeSelectedLifeMajorTabInt2JavaLangStringBoldJavaLangStringNormal);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindBorderBackground(this.tVLearning, vmHomeSelectedLifeMajorTabInt1BooleanTrueBooleanFalse);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextStyle(this.tVLearning, vmHomeSelectedLifeMajorTabInt1JavaLangStringBoldJavaLangStringNormal);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindBorderBackground(this.tVPlaying, vmHomeSelectedLifeMajorTabInt0BooleanTrueBooleanFalse);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextStyle(this.tVPlaying, vmHomeSelectedLifeMajorTabInt0JavaLangStringBoldJavaLangStringNormal);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // vmHome
                com.gibeom.ofriendsmobile.home.ui.HomeViewModel vmHome = mVmHome;
                // vmHome != null
                boolean vmHomeJavaLangObjectNull = false;



                vmHomeJavaLangObjectNull = (vmHome) != (null);
                if (vmHomeJavaLangObjectNull) {




                    vmHome.setSelectedMajorLifeTab(1, "learn");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // vmHome
                com.gibeom.ofriendsmobile.home.ui.HomeViewModel vmHome = mVmHome;
                // vmHome != null
                boolean vmHomeJavaLangObjectNull = false;



                vmHomeJavaLangObjectNull = (vmHome) != (null);
                if (vmHomeJavaLangObjectNull) {




                    vmHome.setSelectedMajorLifeTab(2, "share");
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // vmHome
                com.gibeom.ofriendsmobile.home.ui.HomeViewModel vmHome = mVmHome;
                // vmHome != null
                boolean vmHomeJavaLangObjectNull = false;



                vmHomeJavaLangObjectNull = (vmHome) != (null);
                if (vmHomeJavaLangObjectNull) {




                    vmHome.setSelectedMajorLifeTab(0, "play");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vmHome.selectedLifeMajorTab
        flag 1 (0x2L): vmHome.getLifeNetworkStatus
        flag 2 (0x3L): vmHome
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 2 ? true : false
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 2 ? true : false
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 0 ? true : false
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 0 ? true : false
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 0 ? "bold" : "normal"
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 0 ? "bold" : "normal"
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 1 ? "bold" : "normal"
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 1 ? "bold" : "normal"
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 2 ? "bold" : "normal"
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 2 ? "bold" : "normal"
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 1 ? true : false
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(vmHome.selectedLifeMajorTab.getValue()) == 1 ? true : false
    flag mapping end*/
    //end
}