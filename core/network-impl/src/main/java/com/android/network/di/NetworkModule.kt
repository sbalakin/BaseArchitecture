package com.android.network.di

import com.android.network.data.NetworkRequestImpl
import com.android.network_api.data.NetworkRequestApi
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [NetworkModule.BindsModule::class])
class NetworkModule {

    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient.Builder {
        val headersInterceptor = object : Interceptor {
            override fun intercept(chain: Interceptor.Chain): Response {
                val request: Request = chain.request().newBuilder()
                    .addHeader("x-apikey", "041d4d0457dc9f1e1a49880d56d6c1b657d02")
                    .addHeader("content-type", "application/json; charset=utf-8")
                    .build()
                return chain.proceed(request)
            }
        }

        val builder = OkHttpClient().newBuilder()
        builder.addInterceptor(interceptor)
        builder.addInterceptor(headersInterceptor)

        return builder
    }


    @Provides
    @Singleton
    fun provideApi(client: OkHttpClient.Builder): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://ecomm-4e14.restdb.io/rest/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client.build())
            .build()
    }

    @Module
    interface BindsModule {
        @Binds
        fun provideNetworkRequestApi(networkRequestImpl: NetworkRequestImpl): NetworkRequestApi
    }

}