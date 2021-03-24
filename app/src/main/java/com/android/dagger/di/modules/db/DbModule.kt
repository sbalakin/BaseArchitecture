package com.android.dagger.di.modules.db

import dagger.Module
import dagger.Provides

@Module
class DbModule {

    @Provides
    fun provideRoom(): Room{
        return Room()
    }

    @Provides
    fun provideDbConnector(room: Room): DbConnector{
        return DbConnector(room)
    }

}