package com.scof.base11_radio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.scof.base11_radio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.radioGroup.setOnCheckedChangeListener { group, checkedId ->
            // group : 어떤 라디오 그룹에
            // checkedId : 어떤 라디오 버튼이 눌렸는지
            when(checkedId){
                R.id.radioApple -> {Log.d("라디오버튼", "사과 선택")}
                R.id.radioBanana -> {Log.d("라디오버튼", "바나나 선택")}
                R.id.radioOrange -> {Log.d("라디오버튼", "오렌지 선택")}
            }
        }
    }
}