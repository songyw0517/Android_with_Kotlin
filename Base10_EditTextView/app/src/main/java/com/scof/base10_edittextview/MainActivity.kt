package com.scof.base10_edittextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import com.scof.base10_edittextview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // private lateinit var binding: ActivityMainBinding
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setContentView(binding.root)
        with(binding){
            editText.addTextChangedListener {
                Log.d("에딧텍스트", "입력된 값 : ${it.toString()}")
            }
            btn.setOnClickListener{
                Log.d("에딧텍스트", "버튼 클릭 -> 에딧텍스트 접근 : ${editText.text}")
                textView.text=editText.text
            }
        }

    }
}