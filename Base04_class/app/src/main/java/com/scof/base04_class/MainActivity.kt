package com.scof.base04_class

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    
    // onCreate 함수는 AppcompatActivity 클래스에 정의되어있는 함수임
    // 재정의를 하기 위해 override 사용
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }
}
// 클래스 작성
class Student{
    // property(속성)
    var id:Int
    var name:String

    // 생성자, 초기화
    init {
        id=0
        name="Song"
    }
    // method(메서드)
    fun StudentgetName():String{
        return this.name
    }
    fun StudentgetId():Int{
        return this.id
    }
}

// 클래스 작성 companion object 사용
class l{
    // companion object를 사용하면 인스턴스(객체)를 생성하지 않고 메서드를 사용할 수 있다.
    companion object{
        fun p(tag:String, msg:String){
            print("프린트 : [$tag] : $msg")
        }
    }
}

// 클래스 상속 부분
/*
* 상속을 왜 쓰느냐?
*   1. 기존에 작성된 코드를 재활용하기 위함
*   2. 코드를 재활용하는데 체계적으로 계층 구조화해서 사용하기 위함
*
* 상속을 하기 위해서는 작성된 부모 클래스 앞에 open 키워드를 써야한다.
* 오버라이드를 하기위해서는 작성된 부모 클래스의 해당되는 부분(프로퍼티 or 메서드) 앞에 open 키워드를 써야한다.
*
* */

open class Parent{
    var money = 50000000
    open var house = "강남 200평 아파트"
}

class Child : Parent(){
    // 부모 클래스의 house 변수를 재정의(override) 함, 메서드도 재정의 할 수 있다.
    override var house = "강남 10평 아파트"

    // 상속을 받으면 부모 클래스의 프로퍼티와 메서드를 내 것처럼 사용할 수 있다.
    fun showMoney(){
        Log.d("클래스", "money = ${money}")
    }
}

class Son{
    fun getNumber() : Int{
        return 1
    }

    fun getNumber(param:String) : Int{
        return 2
    }
}