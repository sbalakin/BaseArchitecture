package com.android.impl.data

import com.android.api.data.CatalogLauncherApi
import com.android.impl.R
import com.android.navigation_api.data.ScreenNavigation
import javax.inject.Inject

class CatalogLauncher @Inject constructor() : CatalogLauncherApi {

    override fun getNavigationResource(): Int {
        return 1
    }

    override fun registrationCatalogMain(): ScreenNavigation {
        return ScreenNavigation.CATALOG
    }

    override fun launchCatalogMain() {
        TODO("Not yet implemented")
    }
}