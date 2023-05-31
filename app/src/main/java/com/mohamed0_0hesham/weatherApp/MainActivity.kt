package com.mohamed0_0hesham.weatherApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mohamed0_0hesham.weatherapp.R
import com.mohamed0_0hesham.weatherapp.databinding.ActivityMainBinding
import meow.bottomnavigation.MeowBottomNavigation

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        bottomNavInit()
    }
    private fun bottomNavInit(){
        val bottomNavigation = binding.bottomNav
        bottomNavigation.add(MeowBottomNavigation.Model(1, R.drawable.ic_cloudy))
        bottomNavigation.add(MeowBottomNavigation.Model(2, R.drawable.ic_drop))
        bottomNavigation.add(MeowBottomNavigation.Model(3, R.drawable.ic_heavysnow))
    }
}