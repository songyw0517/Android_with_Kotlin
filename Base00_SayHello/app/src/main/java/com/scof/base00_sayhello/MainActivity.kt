package com.scof.base00_sayhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scof.base00_sayhello.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSay.setOnClickListener{
            binding.textSay.setText("Hello Kotlin")
            // binding.textSay.text = "Hello Kotlin"으로 사용 가능
        }
    }
}