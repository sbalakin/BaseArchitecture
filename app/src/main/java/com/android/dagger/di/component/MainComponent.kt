package com.android.dagger.di.component

import com.android.dagger.MainActivity
import com.android.dagger.di.modules.ActivityModule
import com.android.dagger.di.modules.db.DbModule
import com.android.dagger.di.modules.network.NetworkModule
import dagger.Component

@Component(modules = [ActivityModule::class, NetworkModule::class, DbModule::class])
interface MainComponent {
    fun inject(activity: MainActivity)
}