package com.scof.kotlinsyntaxvar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    /*안드로이드의 시작점 : onCreate*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /************** 변수 ******************/
        var varable = "홍길동" // varable에 "홍길동" 저장

        var varable2:String // varable2는 String형임
        varable2 = "안녕하세요"
        // 위의 varable, varable2는 String형으로, 다른 데이터 타입으로 변경이 불가능하다.

        //코틀린의 기본 타입
        // 실수형
        var doubleValue:Double = 3.141592
        var floatValue:Float = 3.14f

        // 정수형
        var intValue:Int = 1234             // –2,147,483,648 ~ 2,147,483,647
        var longValue:Long = 2_147_483_647  // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807
        var shortValue:Short = 123          // -32768~32767
        var byteValue:Byte = 127            // -128~127

        // 문자형
        var charValue:Char = 'a'
        var stringValue:String = "문자형 길이에 상관없이 값을 입력할 수 있다. = 크기를 특정할 수 없다."

        // 불린형
        var booleanValue:Boolean = true

        // 상수 선언, 상수 이름은 모두 대문자로 표기
        val VALVALUE:Boolean = true

        /************** 조건문 ******************/
        // 비교 연산자 : <, >, <=, >=, ==, !=
        // 문자열 비교 가능
        var result:Boolean = "홍길동" == "홍길동"
        Log.d("compare", "결과 ${result}")

        // 논리 연산자 : &&, ||
        // 부정 연산자 : !
    }
}