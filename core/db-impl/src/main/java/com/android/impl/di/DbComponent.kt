package com.android.impl.di

import com.android.api.di.DbComponentApi
import dagger.Component

@Component(modules = [DbModule::class])
abstract class DbComponent : DbComponentApi{
    companion object {
        fun initDbComponent() : DbComponent {
            return DaggerDbComponent.builder().build()
        }
    }

}