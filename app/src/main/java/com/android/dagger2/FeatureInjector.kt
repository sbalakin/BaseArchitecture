package com.android.dagger2

import com.android.api.di.CatalogComponentApi
import com.android.impl.di.CatalogFeatureComponent
import com.android.impl.di.DbComponent
import com.android.navigation_impl2.di.NavigationComponent
import com.android.network.di.NetworkComponent

class FeatureInjector {

    companion object {
        fun getCatalogFeatureComponent(): CatalogComponentApi {
            return CatalogFeatureComponent.initCatalogFeatureComponent(
                NetworkComponent.initNetworkComponent(),
                DbComponent.initDbComponent(),
                NavigationComponent.navigationComponent
            )
        }
    }

}