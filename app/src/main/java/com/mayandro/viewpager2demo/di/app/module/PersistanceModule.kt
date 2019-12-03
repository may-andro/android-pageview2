package com.mayandro.viewpager2demo.di.app.module

import android.app.Application
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PersistanceModule {

    @Provides
    @Singleton
    internal fun provideSharedPreference(context: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }
}