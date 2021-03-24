package com.android.dagger

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.dagger.data.ClassOne
import com.android.dagger.data.ClassTwo
import com.android.dagger.di.component.DaggerMainComponent
import com.android.dagger.di.modules.ActivityModule
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var myClass: ClassTwo
//
//    @Inject
//    lateinit var myClassOne: ClassOne

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var array = emptyArray<Int>()
        array[9] = 12

        initDagger()
//        findViewById<TextView>(R.id.hello).text = myClassOne.getMyString()
    }


    override fun onStart() {
        super.onStart()
        lookForAlice(listOf(0, 1, 2, 3, 4))
        check<Double>()
    }

    private fun <T : Number> check(){

    }

//    inline fun <reified T : Activity> Context.startActivity() {
//        val intent = Intent(this, T::class)
//        startActivity(intent)
//    }

    private operator fun Number.plus(a : Number) : Number{
        return a.toDouble() + this.toDouble()
    }

    private fun lookForAlice(people: List<Int>)  {
        people.forEach label@{
            if (it == 0) {
                println("zero")
                return@label
            }
        }
        println("not zero")
    }

    private fun initDagger(){
        DaggerMainComponent.builder()
                .activityModule(ActivityModule(this))
                .build().inject(this)
    }
}
