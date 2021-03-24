package com.android.dagger.di.modules.network

import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    fun provideOkHttp(): OkHttp = OkHttp()

    @Provides
    fun provideRetrofit(okHttp : OkHttp): Retrofit = Retrofit(okHttp)

}