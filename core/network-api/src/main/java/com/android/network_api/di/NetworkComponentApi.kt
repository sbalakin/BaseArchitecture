package com.android.network_api.di

import com.android.network_api.data.NetworkRequestApi

interface NetworkComponentApi {

    fun retrofit() : NetworkRequestApi

}