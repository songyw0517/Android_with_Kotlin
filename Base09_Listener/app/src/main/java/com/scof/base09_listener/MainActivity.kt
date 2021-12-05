package com.scof.base09_listener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.scof.base09_listener.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // ActivityMainBinding 객체를 구하여 ContentView로 등록
        // ContentView는 binding의 root 뷰
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener{
            Log.d("리스너", "클릭되었습니다.")
            binding.textView.text = "tqtqt"
        }
        


    }
}