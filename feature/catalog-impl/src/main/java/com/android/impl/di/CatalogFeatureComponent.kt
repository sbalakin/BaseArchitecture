package com.android.impl.di

import com.android.api.di.CatalogComponentApi
import com.android.api.di.DbComponentApi
import com.android.impl.CatalogViewModel
import com.android.navigation_api.di.NavigationComponentApi
import com.android.network_api.di.NetworkComponentApi
import dagger.Component

@Component(
    modules = [CatalogFeatureModule::class],
    dependencies = [NetworkComponentApi::class, DbComponentApi::class, NavigationComponentApi::class]
)
interface CatalogFeatureComponent : CatalogComponentApi {
    fun inject(catalogViewModel: CatalogViewModel)

    companion object{
        var catalogFeatureComponent : CatalogComponentApi? = null

        fun initCatalogFeatureComponent(networkComponentApi: NetworkComponentApi,
                                        dbComponentApi: DbComponentApi,
                                        navigationComponentApi: NavigationComponentApi
        ): CatalogComponentApi{

            if (catalogFeatureComponent == null) {
                catalogFeatureComponent = DaggerCatalogFeatureComponent.builder()
                    .dbComponentApi(dbComponentApi)
                    .networkComponentApi(networkComponentApi)
                    .navigationComponentApi(navigationComponentApi)
                    .build()
            }
            return catalogFeatureComponent!!
        }
    }

}