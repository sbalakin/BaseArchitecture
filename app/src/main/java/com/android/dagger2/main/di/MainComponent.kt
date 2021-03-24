package com.android.dagger2.main.di

import com.android.api.di.CatalogComponentApi
import com.android.dagger.di.component.AppComponent
import com.android.dagger2.main.MainActivity
import com.android.navigation_api.di.NavigationComponentApi
import com.android.network_api.di.NetworkComponentApi
import dagger.Component

@Component(
    modules = [MainModule::class],
    dependencies = [NavigationComponentApi::class]
)
interface MainComponent {
    fun inject(activity: MainActivity)
}