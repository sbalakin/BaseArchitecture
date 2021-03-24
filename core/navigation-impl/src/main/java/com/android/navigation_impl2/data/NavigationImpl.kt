package com.android.navigation_impl.data

import androidx.navigation.ActionOnlyNavDirections
import com.android.navigation_api.data.NavigationApi
import com.android.navigation_api.data.ScreenNavigation
import javax.inject.Inject

class NavigationImpl @Inject constructor(): NavigationApi {

    private val screensMap = mutableMapOf<ScreenNavigation, Int>()

    override fun registration(screenNavigation: ScreenNavigation, navResource: Int) {
        screensMap[screenNavigation] = navResource
    }

    override fun navigateTo(screenNavigation: ScreenNavigation) : ActionOnlyNavDirections? {
        screensMap[screenNavigation]?.let {
            return ActionOnlyNavDirections(it)
        }
        return null
    }

}