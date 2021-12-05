package com.scof.base11_checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.scof.base11_checkbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val listener = CompoundButton.OnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) Log.d("체크박스", "사과 선택")
            else Log.d("체크박스","사과 선택 해제")
        }

        with(binding){
//            checkApple.setOnCheckedChangeListener { buttonView, isChecked ->
//                if(isChecked) Log.d("체크박스", "사과 선택")
//                else Log.d("체크박스","사과 선택 해제")
//
//            }
//            checkBanana.setOnCheckedChangeListener { buttonView, isChecked ->
//                if(isChecked) Log.d("체크박스", "바나나 선택")
//                else Log.d("체크박스","바나나 선택 해제")
//
//            }
//            checkOrange.setOnCheckedChangeListener { buttonView, isChecked ->
//                if(isChecked) Log.d("체크박스", "바나나 선택")
//                else Log.d("체크박스","바나나 선택 해제")
//
//            }
            checkApple.setOnCheckedChangeListener(checkBoxListener)
            checkBanana.setOnCheckedChangeListener(checkBoxListener)
            checkOrange.setOnCheckedChangeListener(checkBoxListener)


        }
    }
    val checkBoxListener = CompoundButton.OnCheckedChangeListener{checkBox, isChecked ->
        if(isChecked) Log.d("체크박스", "${checkBox.text} 선택")
        else Log.d("체크박스","${checkBox.text} 선택 해제")

    }
}