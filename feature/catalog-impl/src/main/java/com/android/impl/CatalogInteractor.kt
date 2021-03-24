package com.android.impl

import com.android.api.data.RoomApi
import com.android.impl.data.Product
import com.android.impl.network.CatalogApi
import retrofit2.Retrofit
import javax.inject.Inject


class CatalogInteractor @Inject constructor(
    val db : RoomApi,
    private val retrofitRequest: CatalogApi) {

    suspend fun requestCatalog(): List<Product>{
        return retrofitRequest.getProducts()
    }

}