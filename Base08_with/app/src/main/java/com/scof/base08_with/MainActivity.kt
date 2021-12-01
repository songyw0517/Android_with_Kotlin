package com.scof.base08_with

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scof.base08_with.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // private lateinit var binding: ActivityMainBinding
    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        binding.button.setOnClickListener{ }
//        binding.imageView.setImageLevel(50)
//        binding.textView.text = "반가워"

        with(binding){
            button.setOnClickListener{ }
            imageView.setImageLevel(50)
            textView.text = "반가워"
        }
    }
}