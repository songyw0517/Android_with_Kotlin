package com.scof.howtousepalette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.scof.howtousepalette.databinding.ActivityCheckboxBinding

class CheckboxActivity : AppCompatActivity() {
    private val binding by lazy { ActivityCheckboxBinding.inflate(layoutInflater) }

    // 체크박스 리스너 새로 작성
    val checkBoxListener = CompoundButton.OnCheckedChangeListener{ checkBox, isChecked ->
        if(isChecked){
            Log.d("체크박스", "${checkBox.text} 선택")
            binding.log.append(checkBox.text.toString())
        }
        else {
            Log.d("체크박스","${checkBox.text} 선택 해제")
            binding.log.text = ""
        }

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            checkApple.setOnCheckedChangeListener(checkBoxListener)
            checkBanana.setOnCheckedChangeListener(checkBoxListener)
            checkOrange.setOnCheckedChangeListener(checkBoxListener)
        }

    }
}