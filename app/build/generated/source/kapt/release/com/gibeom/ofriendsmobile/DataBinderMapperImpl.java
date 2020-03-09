package com.gibeom.ofriendsmobile;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.gibeom.ofriendsmobile.databinding.ActivityMainBindingImpl;
import com.gibeom.ofriendsmobile.databinding.AwesomeBindingImpl;
import com.gibeom.ofriendsmobile.databinding.FragmentHomeBindingImpl;
import com.gibeom.ofriendsmobile.databinding.FragmentLikeBindingImpl;
import com.gibeom.ofriendsmobile.databinding.FragmentProductDetailBindingImpl;
import com.gibeom.ofriendsmobile.databinding.FragmentPromoBindingImpl;
import com.gibeom.ofriendsmobile.databinding.LifeBindingImpl;
import com.gibeom.ofriendsmobile.databinding.ListItemBannerBindingImpl;
import com.gibeom.ofriendsmobile.databinding.ListItemCategoryBindingImpl;
import com.gibeom.ofriendsmobile.databinding.ListItemLifeCategoryBindingImpl;
import com.gibeom.ofriendsmobile.databinding.ListItemProductBindingImpl;
import com.gibeom.ofriendsmobile.databinding.NocontentBindingImpl;
import com.gibeom.ofriendsmobile.databinding.ToolbarNavigateBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_AWESOME = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_FRAGMENTLIKE = 4;

  private static final int LAYOUT_FRAGMENTPRODUCTDETAIL = 5;

  private static final int LAYOUT_FRAGMENTPROMO = 6;

  private static final int LAYOUT_LIFE = 7;

  private static final int LAYOUT_LISTITEMBANNER = 8;

  private static final int LAYOUT_LISTITEMCATEGORY = 9;

  private static final int LAYOUT_LISTITEMLIFECATEGORY = 10;

  private static final int LAYOUT_LISTITEMPRODUCT = 11;

  private static final int LAYOUT_NOCONTENT = 12;

  private static final int LAYOUT_TOOLBARNAVIGATE = 13;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(13);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.awesome, LAYOUT_AWESOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.fragment_like, LAYOUT_FRAGMENTLIKE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.fragment_product_detail, LAYOUT_FRAGMENTPRODUCTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.fragment_promo, LAYOUT_FRAGMENTPROMO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.life, LAYOUT_LIFE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.list_item_banner, LAYOUT_LISTITEMBANNER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.list_item_category, LAYOUT_LISTITEMCATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.list_item_life_category, LAYOUT_LISTITEMLIFECATEGORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.list_item_product, LAYOUT_LISTITEMPRODUCT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.nocontent, LAYOUT_NOCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.gibeom.ofriendsmobile.R.layout.toolbar_navigate, LAYOUT_TOOLBARNAVIGATE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_AWESOME: {
          if ("layout/awesome_0".equals(tag)) {
            return new AwesomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for awesome is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLIKE: {
          if ("layout/fragment_like_0".equals(tag)) {
            return new FragmentLikeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_like is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPRODUCTDETAIL: {
          if ("layout/fragment_product_detail_0".equals(tag)) {
            return new FragmentProductDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_product_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROMO: {
          if ("layout/fragment_promo_0".equals(tag)) {
            return new FragmentPromoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_promo is invalid. Received: " + tag);
        }
        case  LAYOUT_LIFE: {
          if ("layout/life_0".equals(tag)) {
            return new LifeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for life is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMBANNER: {
          if ("layout/list_item_banner_0".equals(tag)) {
            return new ListItemBannerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_banner is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMCATEGORY: {
          if ("layout/list_item_category_0".equals(tag)) {
            return new ListItemCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_category is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMLIFECATEGORY: {
          if ("layout/list_item_life_category_0".equals(tag)) {
            return new ListItemLifeCategoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_life_category is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPRODUCT: {
          if ("layout/list_item_product_0".equals(tag)) {
            return new ListItemProductBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_product is invalid. Received: " + tag);
        }
        case  LAYOUT_NOCONTENT: {
          if ("layout/nocontent_0".equals(tag)) {
            return new NocontentBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for nocontent is invalid. Received: " + tag);
        }
        case  LAYOUT_TOOLBARNAVIGATE: {
          if ("layout/toolbar_navigate_0".equals(tag)) {
            return new ToolbarNavigateBindingImpl(component, new View[]{view});
          }
          throw new IllegalArgumentException("The tag for toolbar_navigate is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case LAYOUT_NOCONTENT: {
          if("layout/nocontent_0".equals(tag)) {
            return new NocontentBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for nocontent is invalid. Received: " + tag);
        }
        case LAYOUT_TOOLBARNAVIGATE: {
          if("layout/toolbar_navigate_0".equals(tag)) {
            return new ToolbarNavigateBindingImpl(component, views);
          }
          throw new IllegalArgumentException("The tag for toolbar_navigate is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(13);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "category");
      sKeys.put(2, "hmVM");
      sKeys.put(3, "homeVM");
      sKeys.put(4, "homeVm");
      sKeys.put(5, "noContentFormat");
      sKeys.put(6, "pos");
      sKeys.put(7, "product");
      sKeys.put(8, "productInfo");
      sKeys.put(9, "total");
      sKeys.put(10, "vMDetail");
      sKeys.put(11, "vMPr");
      sKeys.put(12, "vmHome");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(13);

    static {
      sKeys.put("layout/activity_main_0", com.gibeom.ofriendsmobile.R.layout.activity_main);
      sKeys.put("layout/awesome_0", com.gibeom.ofriendsmobile.R.layout.awesome);
      sKeys.put("layout/fragment_home_0", com.gibeom.ofriendsmobile.R.layout.fragment_home);
      sKeys.put("layout/fragment_like_0", com.gibeom.ofriendsmobile.R.layout.fragment_like);
      sKeys.put("layout/fragment_product_detail_0", com.gibeom.ofriendsmobile.R.layout.fragment_product_detail);
      sKeys.put("layout/fragment_promo_0", com.gibeom.ofriendsmobile.R.layout.fragment_promo);
      sKeys.put("layout/life_0", com.gibeom.ofriendsmobile.R.layout.life);
      sKeys.put("layout/list_item_banner_0", com.gibeom.ofriendsmobile.R.layout.list_item_banner);
      sKeys.put("layout/list_item_category_0", com.gibeom.ofriendsmobile.R.layout.list_item_category);
      sKeys.put("layout/list_item_life_category_0", com.gibeom.ofriendsmobile.R.layout.list_item_life_category);
      sKeys.put("layout/list_item_product_0", com.gibeom.ofriendsmobile.R.layout.list_item_product);
      sKeys.put("layout/nocontent_0", com.gibeom.ofriendsmobile.R.layout.nocontent);
      sKeys.put("layout/toolbar_navigate_0", com.gibeom.ofriendsmobile.R.layout.toolbar_navigate);
    }
  }
}
