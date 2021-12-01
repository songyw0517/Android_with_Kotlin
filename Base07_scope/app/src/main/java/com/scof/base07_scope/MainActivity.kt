package com.scof.base07_scope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        studyRun()
    }
    // 스코프 함수
    // run, let, apply, also
    // with

    /* run
    *
    * */
    fun studyRun(){
        val phones = mutableListOf("010-1234-5678", "010-3235-5652", "010-9999-5652")
        val list = mutableListOf(1,2,3,4,5,6,7,8,9)
        val namess = mutableListOf("Scott", "kelly","Michael")

        val seoulPeople = seoulPeople()

//      seoulPeople.person.add(Person("Scott", "010-1234-5678", 19))
//      seoulPeople.person.add(Person("kelly", "010-3235-5652", 20))
//      seoulPeople.person.add(Person("Michael", "010-9999-5652", 23))

        val resultRun = seoulPeople.person.run{
            // seoulPeople.person 생략
            // 아래의 코드를 수행하고 마지막 값을 반환, 반환값 없을 경우 true 반환
            add(Person("Scott", "010-1234-5678", 19))
            add(Person("kelly", "010-3235-5652", 20))
            add(Person("Michael", "010-9999-5652", 23))
            11 // 반환되는 값
        }

        val resultLet = seoulPeople.person.let{ persons ->
            // seoulPeople.person을 여기서는 persons라고 할꺼야
            // 아래의 코드를 수행하고 마지막 값을 반환, 반환값 없을 경우 true 반환
            persons.add(Person("Scott", "010-1234-5678", 19))
            persons.add(Person("kelly", "010-3235-5652", 20))
            persons.add(Person("Michael", "010-9999-5652", 23))
            "1212" // 반환되는 값
        }

        val resultApply = seoulPeople.person.apply {
            // 아래의 코드를 수행하고 person을 반환
            add(Person("Scott", "010-1234-5678", 19))
            add(Person("kelly", "010-3235-5652", 20))
            add(Person("Michael", "010-9999-5652", 23))
        }

        val resultAlso = seoulPeople.person.also { persons ->
            // 아래의 코드를 수행하고 persons를 반환
            persons.add(Person("Scott", "010-1234-5678", 19))
            persons.add(Person("kelly", "010-3235-5652", 20))
            persons.add(Person("Michael", "010-9999-5652", 23))
        }
        Log.d("scope_fuc", "resultRun = ${resultRun}")
        Log.d("scope_fuc", "resultlet = ${resultLet}")
        Log.d("scope_fuc", "resultApply = ${resultApply}")
        Log.d("scope_fuc", "resultAlso = ${resultAlso}")
    }
}

class seoulPeople{
    var person = mutableListOf<Person>()
    init {
        person.add(Person("Scott", "010-1234-5678", 19))
        person.add(Person("kelly", "010-3235-5652", 20))
        person.add(Person("Michael", "010-9999-5652", 23))
    }
}
data class Person(
    var name:String = "",
    var phones:String = "",
    var age:Int = 21
)