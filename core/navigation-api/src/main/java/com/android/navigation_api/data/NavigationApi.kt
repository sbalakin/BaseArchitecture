package com.android.navigation_api.data

import androidx.navigation.ActionOnlyNavDirections

interface NavigationApi {
    fun registration(screenNavigation: ScreenNavigation, navResource : Int)
    fun navigateTo(screenNavigation: ScreenNavigation) : ActionOnlyNavDirections?
}
