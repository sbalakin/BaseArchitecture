package com.android.network.di

import com.android.network_api.di.NetworkComponentApi
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
abstract class NetworkComponent : NetworkComponentApi{
    companion object {
        fun initNetworkComponent() : NetworkComponent {
            return DaggerNetworkComponent.builder().build()
        }
    }
}