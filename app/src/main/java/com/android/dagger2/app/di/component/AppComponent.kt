package com.android.dagger.di.component

import android.content.Context
import com.android.api.di.CatalogComponentApi
import com.android.dagger.di.modules.ContextModule
import com.android.dagger.di.scope.PerApp
import com.android.dagger2.app.MyApplication
import com.android.navigation_api.di.NavigationComponentApi
import dagger.Component

//@Component(modules = [ActivityModule::class, NetworkModule::class, DbModule::class])
@Component(
    modules = [ContextModule::class],
    dependencies = [
        CatalogComponentApi::class,
        NavigationComponentApi::class]
)
@PerApp
interface AppComponent {

    fun context() : Context

    fun inject(app: MyApplication)
}