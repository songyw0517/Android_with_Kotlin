package com.scof.base01_uselog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.scof.base01_uselog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLog.setOnClickListener {
            Log.d("MainActivity", "Hello Kotlin")
        }
    }
}