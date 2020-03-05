package com.gibeom.ofriendsmobile.di

import com.gibeom.ofriendsmobile.MainActivity

import dagger.Module
import dagger.android.ContributesAndroidInjector

// https://www.charlezz.com/?p=1357
// Subcomponent를 정의한 뒤에는 모듈에 추가.
// 모듈내에서 subcomponent의 factory를 @Binds와 @IntoMap을 사용하여 map으로 멀티바인딩하고, 액티비티를 클래스 키로 지정합니다.
// Subcomponent가 포함된 해당 모듈을 컴포넌트에 추가. 그러면, Application 스코프내에서 해당 subcomponent factory를 주입받을 수 있게 됨.
// 하지만, @ContributesAndroidInjector 애노테이션을 사용하면 위의 코드들을 자동으로 생성
@Suppress("unused")
@Module
abstract class MainActivityModule {
    @ContributesAndroidInjector(modules = [FragmentBuildersModule::class])
    abstract fun contributeMainActivity(): MainActivity
}
