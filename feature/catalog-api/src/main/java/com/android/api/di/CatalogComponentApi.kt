package com.android.api.di

import com.android.api.data.CatalogLauncherApi

interface CatalogComponentApi {
    fun getCatalogLauncher() : CatalogLauncherApi
}