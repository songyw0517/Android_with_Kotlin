package com.scof.base05_nullsafety

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myName:String = "메시"

        // ? = 를 사용함으로써 null을 사용할 수 있음을 명시,
        // 이를 nullable 이라 한다.
        var number:Int? = null

        // 클래스를 사용할 수도, 사용하지 않을 수도 있을 경우 null로 초기화 하는 경우가 존재한다.
        var newVariable: Activity? = null

        /* null 또한 객체이기에 다음과 같은 코드에서는 Null Pointer Exception 오류가 발생한다.
        * 코틀린에서는 nullable이고, 값이 null인 경우 객체(위의 number)에 있는 함수를 호출할시
        * 오류가 발생하여 앱이 멈춘다.
        * -> number.plus()
        *
        * 세이프 콜을 사용하면, 뒤의 함수를 자동으로 호출하지 않게 하여 앱이 멈추는 것을 방지할 수 있다.
        * -> number?.plus(37)
        *
        */

        /* number은 null이기에 세이프 콜에 의하여 plus함수는 실행되지 않는다.
        * 만약 number이 null이어서 plus가 안될 경우 result는 어떤 값을 가지게 되는가?
        * number?.plus(37) 다음 ?: 51 을 통해 number이 null이면 result는 51 값을 가지게 된다.
        * 이를 앨비스 익스프레션이라고 한다.
        */

        var result = number?.plus(37) ?: 51// Safe Call

        var result2 = result.plus(53)

        /* 널 처리
        * - 널러블
        * - 세이프티 콜
        * - 앨비스 익스프레션
        * */
    }
}