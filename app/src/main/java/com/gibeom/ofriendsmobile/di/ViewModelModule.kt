package com.gibeom.ofriendsmobile.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gibeom.ofriendsmobile.home.ui.HomeViewModel

import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(viewModel: HomeViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
