package com.android.api.data

import com.android.navigation_api.data.ScreenNavigation


interface CatalogLauncherApi {
    fun getNavigationResource() : Int
    fun registrationCatalogMain() : ScreenNavigation
    fun launchCatalogMain()

}