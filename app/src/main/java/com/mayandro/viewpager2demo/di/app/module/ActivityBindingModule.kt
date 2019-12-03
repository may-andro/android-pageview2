package com.mayandro.viewpager2demo.di.app.module

import com.mayandro.viewpager2demo.ui.home.HomeActivity
import com.mayandro.viewpager2demo.di.app.scope.PerActivityScope
import com.mayandro.viewpager2demo.ui.onboarding.OnBoardingActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @PerActivityScope
    @ContributesAndroidInjector
    internal abstract fun bindOnBoardingActivity(): OnBoardingActivity

    @PerActivityScope
    @ContributesAndroidInjector
    internal abstract fun bindHomeActivity(): HomeActivity
}