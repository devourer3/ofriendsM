package com.gibeom.ofriendsmobile.di

import android.app.Application
import com.gibeom.ofriendsmobile.OfriendsApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

// https://www.charlezz.com/?p=1357
// 액티비티에 Injection하기 위해서는 AndroidInjectionModule을 애플리케이션 컴포넌트에 포함시켜야

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        MainActivityModule::class]
)
interface AppComponent {
    // 컴포넌트를 생성하기 위한 Builder용 애노테이션입니다.
    // Component 내의 abstract 클래스 또는 interface에 이 애노테이션을 붙입니다.
    // 다음과 같이 Builder를 정의 할 수 있습니다.
    @Component.Builder
    interface Builder {
        // 컴포넌트 빌더내의 메소드에 추가하거나 컴포넌트 팩토리내의 파라미터로 추가하여 객체를 컴포넌트가 가지고 있는 특정 키에 바인딩 하게 됩니다.
        // @BindsInstance를 통해 바인딩된 인스턴스는 Module내에서 제공되는 인스턴스와 동일하게 동작됩니다.
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
    fun inject(application: OfriendsApp)
}
