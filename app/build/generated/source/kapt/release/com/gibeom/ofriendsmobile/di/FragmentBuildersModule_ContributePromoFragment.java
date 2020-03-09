package com.gibeom.ofriendsmobile.di;

import com.gibeom.ofriendsmobile.promo.ui.PromoFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributePromoFragment.PromoFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributePromoFragment {
  private FragmentBuildersModule_ContributePromoFragment() {}

  @Binds
  @IntoMap
  @ClassKey(PromoFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PromoFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface PromoFragmentSubcomponent extends AndroidInjector<PromoFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PromoFragment> {}
  }
}
