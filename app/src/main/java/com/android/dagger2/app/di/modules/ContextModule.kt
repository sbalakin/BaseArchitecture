package com.android.dagger.di.modules

import android.app.Activity
import android.content.Context
import com.android.dagger.di.scope.PerActivity
import dagger.Module
import dagger.Provides

@Module
class ContextModule(private val context: Context) {

    @Provides
    fun provideContext(): Context = context
}
