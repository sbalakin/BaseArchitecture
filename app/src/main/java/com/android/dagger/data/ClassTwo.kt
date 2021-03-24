package com.android.dagger.data

import android.content.Context
import com.android.dagger.R

class ClassTwo(var context: Context) {

    fun getMyString() : String{
        return context.getString(R.string.app_name)
    }
};