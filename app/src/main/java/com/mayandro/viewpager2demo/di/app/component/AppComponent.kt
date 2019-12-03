package com.mayandro.viewpager2demo.di.app.component

import android.app.Application
import com.mayandro.viewpager2demo.BaseApplication
import com.mayandro.viewpager2demo.di.app.module.ActivityBindingModule
import com.mayandro.viewpager2demo.di.app.module.PersistanceModule
import com.mayandro.viewpager2demo.di.app.module.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBindingModule::class,
    ViewModelFactoryModule::class,
    PersistanceModule::class
])
interface AppComponent : AndroidInjector<BaseApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}