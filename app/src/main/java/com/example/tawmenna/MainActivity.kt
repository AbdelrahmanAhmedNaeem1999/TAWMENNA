package com.example.tawmenna

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavigationView=findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val appBarConfiguration= AppBarConfiguration(setOf(R.layout.fragment_home,R.layout.fragment_cart,R.layout.fragment_profile))
        val navController =findNavController(R.id.fragment)
        setupActionBarWithNavController(navController ,appBarConfiguration)
        bottomNavigationView.setupWithNavController(navController)
    }
}