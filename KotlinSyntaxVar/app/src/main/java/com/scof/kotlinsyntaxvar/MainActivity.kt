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
        if(true){
            Log.d("IF", "c랑 같음")
        }else if(result==false) {
            Log.d("IF", "ㄷㄷ")
        }else {
            Log.d("IF", "c랑 같음")
        }

        // when - c, python의 switch
        // when - if문의 확장판
        var month:Int = 12
        when(month){
            9->{
                Log.d("when", "9월 입니다.")
            }
            11,12,1 ->{
                Log.d("when", "겨울 입니다.")
            }
            else -> {
                Log.d("when", "아직 구현되지 않았습니다. ㅇㅅㅇ")
            }
        }

        /************** 배열과 컬렉션 ******************/

        // 배열
        // Int -> IntArray
        /*
        * 배열은 인덱스를 가진다.
        * 선언시 자동으로 0으로 초기화 된다.
        * 사용시에는 인덱스를 이용하여 접근해야한다.
        * */
        var intArr:IntArray = IntArray(10)
        intArr[0] = 10
        for(i in 0..9){
            Log.d("Array", "i = $i")
            Log.d("Array", "intArr[${i}] = ${intArr[i]}")
        }

        // 컬렉션
        /*
        * 개수를 특정하지 않고 값을 넣을때 사용한다.
        * mutableListOf로 초기화하며, 어떤 데이터 타입을 사용할 것인지 명시해야한다.
        * mutable은 동적으로 사용한다는 뜻*/
        var mutableList = mutableListOf<Int>()
        // 값 넣기 -> add
        mutableList.add(11)
        mutableList.add(21)
        mutableList.add(33)
        mutableList.add(44)
        mutableList.add(122)
        Log.d("컬렉션", "mutableList = ${mutableList}")
        Log.d("컬렉션", "3번 인덱스의 값 = ${mutableList[3]} or ${mutableList.get(3)}")

        // 맵 -> (key, value) 쌍으로 가짐, python의 딕셔너리
        var mutableMap = mutableMapOf<String, String>()
        mutableMap.put("키1", "값1")
        mutableMap.put("키2", "값2")
        mutableMap.put("키3", "값3")
        mutableMap.put("키4", "값4")
        Log.d("맵", "mutableMap = ${mutableMap}")
        Log.d("맵", "mutableMap 키1 = ${mutableMap["키1"]} or ${mutableMap.get("키1")}")

        // 반복문
        // for
        // 방법 1 - 범위로
        for(i in 1..10){
            Log.d("loopFor", "값 = ${i}")
        }
        // 방법 2 - until
        // until을 사용하면, 설정한 마지막 값이 빠진다.
        for(i in 1 until 10){
            Log.d("loopFor", "until을 사용하면 -> ${i}")
        }
        // 방법 3 - step
        // step을 사용하면 넘어가는 폭을 지정한다.
        for(i in 0..10 step 2){
            Log.d("loopFor", "step을 사용하면 -> ${i}")
        }
        // 방법 4 - downTo
        // downTo를 사용하면 감소하는 형식의 for문이 된다.
        for(i in 10 downTo 1){
            Log.d("loopFor", "downTo를 사용하면 -> ${i}")
        }
        // 방법 5 - 배열을 사용하는 방법
        var intArray = intArrayOf(0,1,2,3,1212,5,6,7,8)
        for(i in intArray){
            Log.d("loopFor", "배열을 사용하면 -> ${i}")
        }

        // while
        var cnt:Int = 0
        while(result){
            Log.d("loopWhile", "cnt = ${cnt}")
            cnt+=1
            if(cnt==10)
                break
        }
    }
}