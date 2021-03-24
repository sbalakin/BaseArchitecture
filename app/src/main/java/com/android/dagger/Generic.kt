package com.android.dagger

class Generic {

    /**
     * Но сделав генерики ковариативными
     * через слово "out" мы можем работать
     * как с обычным наследованием
     */
    fun zoo(){
        val strs: Util<Animal> = Util()
        val objs: Util<*> = strs
    }

    class Util<T>()

    open class Animal

    class Cat : Animal()

}