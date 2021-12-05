package com.scof.howtousepalette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.scof.howtousepalette.databinding.ActivitySpinnerBinding

class SpinnerActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySpinnerBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var data = listOf("선택하세요", "1월", "2월", "3월")

        var adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data)
        // ArrayAdapter생성, 이 컨텍스트(this)에 android.R.layout.simple_list_item_1 레이아웃을 이용하여 data를 뿌릴 것이야!
        with(binding){
            spinner2.adapter = adapter // 적용

            spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onNothingSelected(parent: AdapterView<*>?)
                {
                    // 아무것도 선택되지 않았을때의 동작
                }
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long)
                {
                    // 선택되었을때의 동작
                    // position : 선택된 아이템의 위치(인덱스)
                    val selected = data.get(position) // data[position]값을 가져옴
                    result.text = selected

                }

            }
        }

    }
}