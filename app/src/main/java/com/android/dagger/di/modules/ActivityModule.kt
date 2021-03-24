package com.android.dagger.di.modules

import android.app.Activity
import android.content.Context
import com.android.dagger.data.ClassTwo
import com.android.dagger.di.scope.PerActivity
import dagger.Module
import dagger.Provides

@Module
class ActivityModule(private val activity: Activity) {

    @Provides
    fun provideContext(): Context = activity

    @Provides
    fun provideClassTwo(context: Context): ClassTwo = ClassTwo(context)
}
