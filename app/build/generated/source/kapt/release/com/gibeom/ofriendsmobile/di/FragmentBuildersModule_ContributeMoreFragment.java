package com.gibeom.ofriendsmobile.di;

import com.gibeom.ofriendsmobile.more.ui.MoreFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeMoreFragment.MoreFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeMoreFragment {
  private FragmentBuildersModule_ContributeMoreFragment() {}

  @Binds
  @IntoMap
  @ClassKey(MoreFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MoreFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface MoreFragmentSubcomponent extends AndroidInjector<MoreFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MoreFragment> {}
  }
}
