package com.android.network.data

import com.android.network_api.data.NetworkRequestApi
import retrofit2.Retrofit
import javax.inject.Inject

class NetworkRequestImpl
@Inject constructor(private val retrofit: Retrofit)
    : NetworkRequestApi {

    override fun retrofit(): Retrofit {
        return retrofit
    }

}