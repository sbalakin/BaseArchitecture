package com.android.impl.network

import com.android.impl.data.Product
import retrofit2.http.GET
import retrofit2.http.Header

interface CatalogApi {

    @GET("products")
    suspend fun getProducts(): List<Product>
}