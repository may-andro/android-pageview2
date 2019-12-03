package com.mayandro.viewpager2demo.di.app.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mayandro.viewpager2demo.di.app.utils.ViewModelFactory
import com.mayandro.viewpager2demo.di.app.utils.ViewModelKey
import com.mayandro.viewpager2demo.ui.home.HomeActivityViewModel
import com.mayandro.viewpager2demo.ui.onboarding.OnBoardingViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import javax.inject.Singleton

@Module
abstract class ViewModelFactoryModule {

    @Binds
    @Singleton
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(OnBoardingViewModel::class)
    abstract fun bindOnBoardingViewModel(onBoardingViewModel: OnBoardingViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(HomeActivityViewModel::class)
    abstract fun bindHomeActivityViewModel(homeActivityViewModel: HomeActivityViewModel): ViewModel
}
