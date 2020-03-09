package com.gibeom.ofriendsmobile.databinding;
import com.gibeom.ofriendsmobile.R;
import com.gibeom.ofriendsmobile.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.gibeom.ofriendsmobile.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(14);
        sIncludes.setIncludes(6, 
            new String[] {"awesome", "life"},
            new int[] {11, 12},
            new int[] {com.gibeom.ofriendsmobile.R.layout.awesome,
                com.gibeom.ofriendsmobile.R.layout.life});
        sIncludes.setIncludes(7, 
            new String[] {"nocontent"},
            new int[] {13},
            new int[] {com.gibeom.ofriendsmobile.R.layout.nocontent});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.main_toolbar, 10);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.FrameLayout mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[7]
            , (com.gibeom.ofriendsmobile.databinding.LifeBinding) bindings[12]
            , (com.gibeom.ofriendsmobile.databinding.NocontentBinding) bindings[13]
            , (com.gibeom.ofriendsmobile.databinding.AwesomeBinding) bindings[11]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[3]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[5]
            , (android.view.View) bindings[10]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[4]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            );
        this.aBHome.setTag(null);
        this.cLBottomSheet.setTag(null);
        this.iVAwesomeDot.setTag(null);
        this.iVLifeDot.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (android.widget.FrameLayout) bindings[6];
        this.mboundView6.setTag(null);
        this.rVSearch.setTag(null);
        this.tVAwesome.setTag(null);
        this.tVLife.setTag(null);
        this.tVSearchResult.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.gibeom.ofriendsmobile.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.gibeom.ofriendsmobile.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80L;
        }
        iCawesome.invalidateAll();
        iCLife.invalidateAll();
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
        if (iCawesome.hasPendingBindings()) {
            return true;
        }
        if (iCLife.hasPendingBindings()) {
            return true;
        }
        if (iCNoContent.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.homeVm == variableId) {
            setHomeVm((com.gibeom.ofriendsmobile.home.ui.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHomeVm(@Nullable com.gibeom.ofriendsmobile.home.ui.HomeViewModel HomeVm) {
        this.mHomeVm = HomeVm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.homeVm);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        iCawesome.setLifecycleOwner(lifecycleOwner);
        iCLife.setLifecycleOwner(lifecycleOwner);
        iCNoContent.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHomeVmSearchText((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeICNoContent((com.gibeom.ofriendsmobile.databinding.NocontentBinding) object, fieldId);
            case 2 :
                return onChangeHomeVmSelectedTab((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
            case 3 :
                return onChangeICLife((com.gibeom.ofriendsmobile.databinding.LifeBinding) object, fieldId);
            case 4 :
                return onChangeHomeVmSearchTotalNumber((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeICawesome((com.gibeom.ofriendsmobile.databinding.AwesomeBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHomeVmSearchText(androidx.lifecycle.MutableLiveData<java.lang.String> HomeVmSearchText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeICNoContent(com.gibeom.ofriendsmobile.databinding.NocontentBinding ICNoContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHomeVmSelectedTab(androidx.lifecycle.MutableLiveData<java.lang.Integer> HomeVmSelectedTab, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeICLife(com.gibeom.ofriendsmobile.databinding.LifeBinding ICLife, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeHomeVmSearchTotalNumber(androidx.lifecycle.MutableLiveData<java.lang.String> HomeVmSearchTotalNumber, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeICawesome(com.gibeom.ofriendsmobile.databinding.AwesomeBinding ICawesome, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        com.gibeom.ofriendsmobile.home.ui.HomeViewModel homeVm = mHomeVm;
        androidx.lifecycle.MutableLiveData<java.lang.String> homeVmSearchText = null;
        int homeVmSelectedTabInt0ViewVISIBLEViewGONE = 0;
        java.lang.String homeVmSearchTotalNumberGetValue = null;
        boolean homeVmSearchTotalNumberEqualsJavaLangString0 = false;
        boolean homeVmSelectedTabInt1 = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> homeVmSelectedTab = null;
        int homeVmSearchTotalNumberEqualsJavaLangString0ViewVISIBLEViewGONE = 0;
        java.lang.String homeVmSearchTextGetValue = null;
        int homeVmSearchTotalNumberEqualsJavaLangString0ViewGONEViewVISIBLE = 0;
        java.lang.Integer homeVmSelectedTabGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> homeVmSearchTotalNumber = null;
        int homeVmSelectedTabInt1ViewVISIBLEViewGONE = 0;
        java.lang.String homeVmSelectedTabInt1JavaLangStringBoldJavaLangStringNormal = null;
        int androidxDatabindingViewDataBindingSafeUnboxHomeVmSelectedTabGetValue = 0;
        boolean homeVmSelectedTabInt0 = false;
        java.lang.String homeVmSelectedTabInt0JavaLangStringBoldJavaLangStringNormal = null;

        if ((dirtyFlags & 0xd5L) != 0) {


            if ((dirtyFlags & 0xd1L) != 0) {

                    if (homeVm != null) {
                        // read homeVm.searchText
                        homeVmSearchText = homeVm.getSearchText();
                        // read homeVm.searchTotalNumber
                        homeVmSearchTotalNumber = homeVm.getSearchTotalNumber();
                    }
                    updateLiveDataRegistration(0, homeVmSearchText);
                    updateLiveDataRegistration(4, homeVmSearchTotalNumber);


                    if (homeVmSearchText != null) {
                        // read homeVm.searchText.getValue()
                        homeVmSearchTextGetValue = homeVmSearchText.getValue();
                    }
                    if (homeVmSearchTotalNumber != null) {
                        // read homeVm.searchTotalNumber.getValue()
                        homeVmSearchTotalNumberGetValue = homeVmSearchTotalNumber.getValue();
                    }

                if ((dirtyFlags & 0xd0L) != 0) {

                        if (homeVmSearchTotalNumberGetValue != null) {
                            // read homeVm.searchTotalNumber.getValue().equals("0")
                            homeVmSearchTotalNumberEqualsJavaLangString0 = homeVmSearchTotalNumberGetValue.equals("0");
                        }
                    if((dirtyFlags & 0xd0L) != 0) {
                        if(homeVmSearchTotalNumberEqualsJavaLangString0) {
                                dirtyFlags |= 0x800L;
                                dirtyFlags |= 0x2000L;
                        }
                        else {
                                dirtyFlags |= 0x400L;
                                dirtyFlags |= 0x1000L;
                        }
                    }


                        // read homeVm.searchTotalNumber.getValue().equals("0") ? View.VISIBLE : View.GONE
                        homeVmSearchTotalNumberEqualsJavaLangString0ViewVISIBLEViewGONE = ((homeVmSearchTotalNumberEqualsJavaLangString0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                        // read homeVm.searchTotalNumber.getValue().equals("0") ? View.GONE : View.VISIBLE
                        homeVmSearchTotalNumberEqualsJavaLangString0ViewGONEViewVISIBLE = ((homeVmSearchTotalNumberEqualsJavaLangString0) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0xc4L) != 0) {

                    if (homeVm != null) {
                        // read homeVm.selectedTab
                        homeVmSelectedTab = homeVm.getSelectedTab();
                    }
                    updateLiveDataRegistration(2, homeVmSelectedTab);


                    if (homeVmSelectedTab != null) {
                        // read homeVm.selectedTab.getValue()
                        homeVmSelectedTabGetValue = homeVmSelectedTab.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxHomeVmSelectedTabGetValue = androidx.databinding.ViewDataBinding.safeUnbox(homeVmSelectedTabGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 1
                    homeVmSelectedTabInt1 = (androidxDatabindingViewDataBindingSafeUnboxHomeVmSelectedTabGetValue) == (1);
                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 0
                    homeVmSelectedTabInt0 = (androidxDatabindingViewDataBindingSafeUnboxHomeVmSelectedTabGetValue) == (0);
                if((dirtyFlags & 0xc4L) != 0) {
                    if(homeVmSelectedTabInt1) {
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x10000L;
                    }
                }
                if((dirtyFlags & 0xc4L) != 0) {
                    if(homeVmSelectedTabInt0) {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x80000L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                            dirtyFlags |= 0x40000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 1 ? View.VISIBLE : View.GONE
                    homeVmSelectedTabInt1ViewVISIBLEViewGONE = ((homeVmSelectedTabInt1) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 1 ? "bold" : "normal"
                    homeVmSelectedTabInt1JavaLangStringBoldJavaLangStringNormal = ((homeVmSelectedTabInt1) ? ("bold") : ("normal"));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 0 ? View.VISIBLE : View.GONE
                    homeVmSelectedTabInt0ViewVISIBLEViewGONE = ((homeVmSelectedTabInt0) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 0 ? "bold" : "normal"
                    homeVmSelectedTabInt0JavaLangStringBoldJavaLangStringNormal = ((homeVmSelectedTabInt0) ? ("bold") : ("normal"));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xc4L) != 0) {
            // api target 1

            this.iCLife.getRoot().setVisibility(homeVmSelectedTabInt1ViewVISIBLEViewGONE);
            this.iCawesome.getRoot().setVisibility(homeVmSelectedTabInt0ViewVISIBLEViewGONE);
            this.iVAwesomeDot.setVisibility(homeVmSelectedTabInt0ViewVISIBLEViewGONE);
            this.iVLifeDot.setVisibility(homeVmSelectedTabInt1ViewVISIBLEViewGONE);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextStyle(this.tVAwesome, homeVmSelectedTabInt0JavaLangStringBoldJavaLangStringNormal);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextStyle(this.tVLife, homeVmSelectedTabInt1JavaLangStringBoldJavaLangStringNormal);
        }
        if ((dirtyFlags & 0xd0L) != 0) {
            // api target 1

            this.iCNoContent.getRoot().setVisibility(homeVmSearchTotalNumberEqualsJavaLangString0ViewVISIBLEViewGONE);
            this.rVSearch.setVisibility(homeVmSearchTotalNumberEqualsJavaLangString0ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x80L) != 0) {
            // api target 1

            this.tVAwesome.setOnClickListener(mCallback6);
            this.tVLife.setOnClickListener(mCallback7);
        }
        if ((dirtyFlags & 0xd1L) != 0) {
            // api target 1

            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindTextFormat(this.tVSearchResult, "S0010", homeVmSearchTextGetValue, homeVmSearchTotalNumberGetValue);
        }
        executeBindingsOn(iCawesome);
        executeBindingsOn(iCLife);
        executeBindingsOn(iCNoContent);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // homeVm
                com.gibeom.ofriendsmobile.home.ui.HomeViewModel homeVm = mHomeVm;
                // homeVm != null
                boolean homeVmJavaLangObjectNull = false;



                homeVmJavaLangObjectNull = (homeVm) != (null);
                if (homeVmJavaLangObjectNull) {



                    homeVm.setSelectedTab(0);
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // homeVm
                com.gibeom.ofriendsmobile.home.ui.HomeViewModel homeVm = mHomeVm;
                // homeVm != null
                boolean homeVmJavaLangObjectNull = false;



                homeVmJavaLangObjectNull = (homeVm) != (null);
                if (homeVmJavaLangObjectNull) {



                    homeVm.setSelectedTab(1);
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): homeVm.searchText
        flag 1 (0x2L): iCNoContent
        flag 2 (0x3L): homeVm.selectedTab
        flag 3 (0x4L): iCLife
        flag 4 (0x5L): homeVm.searchTotalNumber
        flag 5 (0x6L): iCawesome
        flag 6 (0x7L): homeVm
        flag 7 (0x8L): null
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 0 ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 0 ? View.VISIBLE : View.GONE
        flag 10 (0xbL): homeVm.searchTotalNumber.getValue().equals("0") ? View.VISIBLE : View.GONE
        flag 11 (0xcL): homeVm.searchTotalNumber.getValue().equals("0") ? View.VISIBLE : View.GONE
        flag 12 (0xdL): homeVm.searchTotalNumber.getValue().equals("0") ? View.GONE : View.VISIBLE
        flag 13 (0xeL): homeVm.searchTotalNumber.getValue().equals("0") ? View.GONE : View.VISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 1 ? View.VISIBLE : View.GONE
        flag 15 (0x10L): androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 1 ? View.VISIBLE : View.GONE
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 1 ? "bold" : "normal"
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 1 ? "bold" : "normal"
        flag 18 (0x13L): androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 0 ? "bold" : "normal"
        flag 19 (0x14L): androidx.databinding.ViewDataBinding.safeUnbox(homeVm.selectedTab.getValue()) == 0 ? "bold" : "normal"
    flag mapping end*/
    //end
}