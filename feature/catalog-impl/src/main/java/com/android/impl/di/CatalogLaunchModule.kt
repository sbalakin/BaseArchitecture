package com.android.impl.di

import com.android.api.data.CatalogLauncherApi
import com.android.impl.data.CatalogLauncher
import dagger.Binds
import dagger.Module

@Module
abstract class CatalogLaunchModule {

    @Binds
    abstract fun provideCatalogLauncher(catalogLauncher: CatalogLauncher) : CatalogLauncherApi

}