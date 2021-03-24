package com.android.dagger.data

import javax.inject.Inject

class ClassOne @Inject constructor(var classTwo: ClassTwo){

    fun getMyString() : String{
        return classTwo.getMyString()
    }
};