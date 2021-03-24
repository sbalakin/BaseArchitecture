package com.android.navigation_impl.di

import com.android.navigation_api.data.NavigationApi
import com.android.navigation_impl.data.NavigationImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class NavigationModule {

    @Binds
    @Singleton
    abstract fun provideNavigation(nav : NavigationImpl): NavigationApi
}