package com.gibeom.ofriendsmobile.di;

import com.gibeom.ofriendsmobile.home.ui.HomeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeHomeFragment.HomeFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeHomeFragment {
  private FragmentBuildersModule_ContributeHomeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HomeFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeFragment> {}
  }
}
