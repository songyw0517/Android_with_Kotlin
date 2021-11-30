package com.scof.base02_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.scof.base02_kotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*LOG 사용*/
        var myNames = "SCOF"
        Log.d(TAG, "my name = $myNames")
        myNames = "LOSTARK"
        Log.d(TAG, "my name = $myNames")
        val PI = 3.141592
        Log.d(TAG, "PI = $PI")

        var myNumbers = "1,2,3,4,5,6"
        var thisWeekNumbers = "1,2,3,4,5,6"
        if (myNumbers == thisWeekNumbers){
            Log.d(TAG, "당첨되었습니다.")

        }else{
            Log.d(TAG, "당첨되지 않았습니다.")
        }
        for(index in 1..10){
            Log.d(TAG, "현재 숫자는 ${index}입니다.")
        }
        /*화면에 띄우기*/
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var temp = true
        if (temp){
            binding.showText.text = "temp = true"
            for(i in 2..10){
                binding.showText.append("\n반복문으로 ${i}를 추가해버렷")
            }
        }
    }
}