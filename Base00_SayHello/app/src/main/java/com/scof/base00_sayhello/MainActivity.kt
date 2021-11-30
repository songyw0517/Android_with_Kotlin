package com.scof.base00_sayhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scof.base00_sayhello.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // ActivityMainBinding 형

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // ActivityMain.xml의 루트로 설정

        /*btnSay 클릭 리스너*/
        binding.btnSay.setOnClickListener{
            binding.textSay.text = "Hello Kotlin"
            // setText 사용가능하지만 지양
        }
    }
}