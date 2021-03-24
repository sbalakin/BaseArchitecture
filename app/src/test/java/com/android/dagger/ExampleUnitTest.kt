package com.android.dagger

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        reverseArray(arrayOf(1,4,3,2))
        assertEquals(4, 2 + 2)
    }

    fun reverseArray(a: Array<Int>): Array<Int> {
        var count = a.size/2

        while (count-- >= 0){
            val temp = a[count]
            a[count] = a[a.size - count - 1]
            a[a.size - count - 1] = temp
        }
        println(a.toString())
        return a
    }
}