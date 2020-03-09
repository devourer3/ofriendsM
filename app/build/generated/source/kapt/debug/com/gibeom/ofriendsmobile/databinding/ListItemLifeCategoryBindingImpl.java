package com.gibeom.ofriendsmobile.databinding;
import com.gibeom.ofriendsmobile.R;
import com.gibeom.ofriendsmobile.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ListItemLifeCategoryBindingImpl extends ListItemLifeCategoryBinding implements com.gibeom.ofriendsmobile.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ListItemLifeCategoryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ListItemLifeCategoryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tVMinorCat.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.gibeom.ofriendsmobile.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
        if (BR.hmVM == variableId) {
            setHmVM((com.gibeom.ofriendsmobile.home.ui.HomeViewModel) variable);
        }
        else if (BR.category == variableId) {
            setCategory((com.gibeom.ofriendsmobile.home.data.LifeCategory) variable);
        }
        else if (BR.pos == variableId) {
            setPos((java.lang.Integer) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHmVM(@Nullable com.gibeom.ofriendsmobile.home.ui.HomeViewModel HmVM) {
        this.mHmVM = HmVM;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.hmVM);
        super.requestRebind();
    }
    public void setCategory(@Nullable com.gibeom.ofriendsmobile.home.data.LifeCategory Category) {
        this.mCategory = Category;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.category);
        super.requestRebind();
    }
    public void setPos(@Nullable java.lang.Integer Pos) {
        this.mPos = Pos;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.pos);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeHmVMSelectedLifeMinorTab((androidx.lifecycle.MutableLiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeHmVMSelectedLifeMinorTab(androidx.lifecycle.MutableLiveData<java.lang.Integer> HmVMSelectedLifeMinorTab, int fieldId) {
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
        java.lang.Integer hmVMSelectedLifeMinorTabGetValue = null;
        com.gibeom.ofriendsmobile.home.ui.HomeViewModel hmVM = mHmVM;
        boolean hmVMSelectedLifeMinorTabPos = false;
        androidx.lifecycle.MutableLiveData<java.lang.Integer> hmVMSelectedLifeMinorTab = null;
        java.lang.String categoryTitle = null;
        boolean hmVMSelectedLifeMinorTabPosBooleanTrueBooleanFalse = false;
        com.gibeom.ofriendsmobile.home.data.LifeCategory category = mCategory;
        java.lang.Integer pos = mPos;

        if ((dirtyFlags & 0x1bL) != 0) {



                if (hmVM != null) {
                    // read hmVM.selectedLifeMinorTab
                    hmVMSelectedLifeMinorTab = hmVM.getSelectedLifeMinorTab();
                }
                updateLiveDataRegistration(0, hmVMSelectedLifeMinorTab);


                if (hmVMSelectedLifeMinorTab != null) {
                    // read hmVM.selectedLifeMinorTab.getValue()
                    hmVMSelectedLifeMinorTabGetValue = hmVMSelectedLifeMinorTab.getValue();
                }


                // read hmVM.selectedLifeMinorTab.getValue() == pos
                hmVMSelectedLifeMinorTabPos = (hmVMSelectedLifeMinorTabGetValue) == (pos);
            if((dirtyFlags & 0x1bL) != 0) {
                if(hmVMSelectedLifeMinorTabPos) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read hmVM.selectedLifeMinorTab.getValue() == pos ? true : false
                hmVMSelectedLifeMinorTabPosBooleanTrueBooleanFalse = ((hmVMSelectedLifeMinorTabPos) ? (true) : (false));
        }
        if ((dirtyFlags & 0x14L) != 0) {



                if (category != null) {
                    // read category.title
                    categoryTitle = category.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x14L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tVMinorCat, categoryTitle);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.tVMinorCat.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0x1bL) != 0) {
            // api target 1

            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindWhiteRdBg(this.tVMinorCat, hmVMSelectedLifeMinorTabPosBooleanTrueBooleanFalse);
            com.gibeom.ofriendsmobile.utils.BindingAdaptersKt.bindLcTextColor(this.tVMinorCat, hmVMSelectedLifeMinorTabPosBooleanTrueBooleanFalse);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // category.filter
        java.lang.String categoryFilter = null;
        // category
        com.gibeom.ofriendsmobile.home.data.LifeCategory category = mCategory;
        // pos
        java.lang.Integer pos = mPos;
        // hmVM
        com.gibeom.ofriendsmobile.home.ui.HomeViewModel hmVM = mHmVM;
        // category != null
        boolean categoryJavaLangObjectNull = false;
        // hmVM != null
        boolean hmVMJavaLangObjectNull = false;



        hmVMJavaLangObjectNull = (hmVM) != (null);
        if (hmVMJavaLangObjectNull) {




            categoryJavaLangObjectNull = (category) != (null);
            if (categoryJavaLangObjectNull) {


                categoryFilter = category.getFilter();

                hmVM.setSelectedMinorLifeTab(pos, categoryFilter);
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): hmVM.selectedLifeMinorTab
        flag 1 (0x2L): hmVM
        flag 2 (0x3L): category
        flag 3 (0x4L): pos
        flag 4 (0x5L): null
        flag 5 (0x6L): hmVM.selectedLifeMinorTab.getValue() == pos ? true : false
        flag 6 (0x7L): hmVM.selectedLifeMinorTab.getValue() == pos ? true : false
    flag mapping end*/
    //end
}