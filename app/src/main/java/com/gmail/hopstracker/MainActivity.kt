package com.gmail.hopstracker

import android.app.Activity
import android.os.Bundle
import com.gmail.hopstracker.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //try again again again again again god lets try
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}