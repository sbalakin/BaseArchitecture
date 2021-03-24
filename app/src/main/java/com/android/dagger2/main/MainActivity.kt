package com.android.dagger2.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.android.dagger2.R
import com.android.dagger2.main.di.DaggerMainComponent
import com.android.navigation_api.data.NavigationApi
import com.android.navigation_api.data.ScreenNavigation
import com.android.navigation_impl2.di.NavigationComponent
import com.google.android.material.bottomnavigation.BottomNavigationView
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigation : NavigationApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initDagger()

        navigation.toString()

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)

//        val action = navigation.navigateTo(ScreenNavigation.CATALOG)
//        if (action != null) {
            navController.navigate(R.id.action_catalog_flow)
//        }
    }

    private fun initDagger(){
        DaggerMainComponent.builder()
            .navigationComponentApi(NavigationComponent.navigationComponent)
            .build()
            .inject(this)
    }


}