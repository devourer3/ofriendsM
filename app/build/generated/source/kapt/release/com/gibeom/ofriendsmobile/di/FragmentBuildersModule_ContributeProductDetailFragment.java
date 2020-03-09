package com.gibeom.ofriendsmobile.di;

import com.gibeom.ofriendsmobile.productdetail.ui.ProductDetailFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      FragmentBuildersModule_ContributeProductDetailFragment.ProductDetailFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeProductDetailFragment {
  private FragmentBuildersModule_ContributeProductDetailFragment() {}

  @Binds
  @IntoMap
  @ClassKey(ProductDetailFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      ProductDetailFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface ProductDetailFragmentSubcomponent
      extends AndroidInjector<ProductDetailFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ProductDetailFragment> {}
  }
}
