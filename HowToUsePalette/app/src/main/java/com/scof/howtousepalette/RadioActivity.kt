package com.scof.howtousepalette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.scof.howtousepalette.databinding.ActivityRadioBinding
import com.scof.howtousepalette.studyLog
class RadioActivity : AppCompatActivity() {
    private val binding by lazy { ActivityRadioBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            binding.radioGroup1.setOnCheckedChangeListener { group, checkedId ->

                studyLog("group = ${group.id.toString()} checkedId = ${checkedId.toString()}")
                when(group){
                    radioGroup1 -> studyLog("과일 선택")
                }
                when(checkedId){
                    R.id.radioApple -> studyLog("사과 선택")
                    R.id.radioBanana -> studyLog("바나나 선택")
                    R.id.radioOrange -> studyLog("오렌지 선택")
                }
            }
            binding.radioGroup2.setOnCheckedChangeListener { group, checkedId ->

                studyLog("group = ${group.id.toString()} checkedId = ${checkedId.toString()}")
                when(group){
                    radioGroup2 -> studyLog("탈 것 선택")
                }
                when(checkedId){
                    R.id.radio기차 -> studyLog("기차 선택")
                    R.id.radio자동차 -> studyLog("자동차 선택")
                    R.id.radio비행기 -> studyLog("비행기")
                }
            }
        }
    }
}