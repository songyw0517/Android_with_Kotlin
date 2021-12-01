package com.scof.base03_fuc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    // 기본함수
    fun functionName(){
        //code
    }

    // 입력값이 있는 함수
    // 파라미터에 데이터 타입 명시
    fun functionParam(param1:String, param2:Int, name:String){
        // code
    }
    
    // 출력값이 있는 함수
    // 출력값인 함수에 출력 데이터 타입 명시
    fun functionOutput() : String{
        return "output"
    }

    // 함수를 사용하는 이유 -> 코드 분류

}