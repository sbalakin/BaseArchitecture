package com.android.dagger2.app

import android.app.Application
import com.android.api.data.CatalogLauncherApi
import com.android.dagger.di.component.AppComponent
import com.android.dagger.di.component.DaggerAppComponent
import com.android.dagger.di.modules.ContextModule
import com.android.dagger2.FeatureInjector
import com.android.impl.di.CatalogFeatureComponent
import com.android.navigation_api.data.NavigationApi
import com.android.navigation_impl2.di.NavigationComponent
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var appComponent : AppComponent

    @Inject lateinit var navigationApi : NavigationApi
    @Inject lateinit var catalogLauncherApi: CatalogLauncherApi

    override fun onCreate() {
        super.onCreate()
        initDagger()
        navigationApi.registration(
            catalogLauncherApi.registrationCatalogMain(),
            catalogLauncherApi.getNavigationResource()
        )
    }

    private fun initDagger(){
        appComponent = DaggerAppComponent.builder()
            .contextModule(ContextModule(this))
            .catalogComponentApi(FeatureInjector.getCatalogFeatureComponent())
            .navigationComponentApi(NavigationComponent.navigationComponent)
            .build()
        appComponent.inject(this)
    }
}