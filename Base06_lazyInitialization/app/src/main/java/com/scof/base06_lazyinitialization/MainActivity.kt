package com.scof.base06_lazyinitialization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    /* 지연초기화
    * 사용 이유
    *  > 특정 조건에서만 사용되는 변수가 있는 경우 -> 미리 값을 할당할 필요가 없음 (자원낭비)
    *  > 메모리가 낭비되는 것을 막기 위해 '지연초기화'를 사용
    * 
    * 사용 방법
    *  1. lateinit var 변수명:타입 - 바꿀 수 있음
    *  2. lazy 사용 - 바꿀 수 없음
    * 주의 사항
    *  > 기본형에는 사용할 수 없다.
    * */
    var name:String = "Scott" // name이 사용되지 않는다면 "Scott" 값을 가진 메모리 낭비
    lateinit var name2:String // name2는 어딘가에서 값을 넣는다는 의미
    lateinit var person:Person

    // lazy
    // val 변수명 by lazy {변수에 들어갈 '클래스 생성자' 또는 '값'}
    // val 이기에 바꿀 수 없다.
    val age by lazy { Person() }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class Person{
    var name = ""
    var age = ""
    var address = ""
    var tel = ""
}