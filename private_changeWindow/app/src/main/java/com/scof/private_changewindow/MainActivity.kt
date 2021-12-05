package com.scof.private_changewindow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scof.private_changewindow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            button.setOnClickListener {
                val intent = Intent(it.context, Sub1Activity::class.java)
                startActivity(intent)
            }
        }

    }
}