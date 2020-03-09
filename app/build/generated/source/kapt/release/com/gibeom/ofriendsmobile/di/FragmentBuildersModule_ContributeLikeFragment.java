package com.gibeom.ofriendsmobile.di;

import com.gibeom.ofriendsmobile.like.ui.LikeFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = FragmentBuildersModule_ContributeLikeFragment.LikeFragmentSubcomponent.class
)
public abstract class FragmentBuildersModule_ContributeLikeFragment {
  private FragmentBuildersModule_ContributeLikeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LikeFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LikeFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LikeFragmentSubcomponent extends AndroidInjector<LikeFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LikeFragment> {}
  }
}
