package com.android.impl.di

import com.android.api.data.CatalogLauncherApi
import com.android.api.data.RoomApi
import com.android.impl.CatalogInteractor
import com.android.impl.data.CatalogLauncher
import com.android.impl.network.CatalogApi
import com.android.network_api.data.NetworkRequestApi
import dagger.Module
import dagger.Provides

@Module
class CatalogFeatureModule() {

    @Provides
    fun provideCatalogInteractor(net: CatalogApi, db: RoomApi) : CatalogInteractor{
        return CatalogInteractor(db, net)
    }

    @Provides
    fun provideCatalogLauncher() : CatalogLauncherApi{
        return CatalogLauncher()
    }

    @Provides
    fun provideCatalogRetrofitApi(net: NetworkRequestApi) : CatalogApi{
        return net.retrofit().create(CatalogApi::class.java)
    }

}