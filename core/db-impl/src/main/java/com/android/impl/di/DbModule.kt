package com.android.impl.di

import com.android.api.data.RoomApi
import com.android.impl.data.DbConnector
import dagger.Binds
import dagger.Module

@Module
abstract class DbModule {

    @Binds
    abstract fun provideDbConnector(dbConnector : DbConnector): RoomApi

}