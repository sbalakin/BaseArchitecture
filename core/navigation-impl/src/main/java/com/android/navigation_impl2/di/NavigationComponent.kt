package com.android.navigation_impl2.di

import com.android.navigation_api.data.NavigationApi
import com.android.navigation_api.di.NavigationComponentApi
import com.android.navigation_impl.di.NavigationModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [NavigationModule::class])
abstract class NavigationComponent : NavigationComponentApi{

    companion object {
        val navigationComponent = initNavigationComponent()

        private fun initNavigationComponent() : NavigationComponent {
            return DaggerNavigationComponent.builder()
                .build()
        }
    }
}