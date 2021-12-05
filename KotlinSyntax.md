# 변수
    - var, val 존재
    - var은 값을 바꿀 수 있는 변수
    - val은 값을 바꿀 수 없는 상수
    - val을 사용할 때, 상수 이름은 모두 대문자로 표기
``` kotlin
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
```
# 조건문
- if, when이 존재
    ## if
    ``` kotlin
    if("조건문"){
        // code
    }else if("조건문"){
        // code
    }else{
        // code
    }
    ```
    ## when
    ``` kotlin
    when("상수"){
        1->{
            // code
        }
        2->{
            // code
        }
        3,4,5 ->{
            // code
        }
        else ->{
            // code
        }
    }
    ```

# 배열과 컬렉션, 맵
- 
    ## 배열
    - 인덱스를 가짐
    - 선언시 사이즈를 지정
    - 선언과 함께 자동으로 0으로 초기화
    ``` kotlin
    var intArr:IntArray = IntArray(10)
    intArr[0] = 10
    for(i in 0..9){
        Log.d("Array", "i = $i")
        Log.d("Array", "intArr[${i}] = ${intArr[i]}")
    }
    ```

    ## 컬렉션
    - 개수를 특정하지 않고 값을 넣을 때 사용
    - mutableListOf로 초기화하며, 어떤 데이터 타입을 사용할 것인지 명시해야한다.
    - mutable은 동적으로 사용한다는 뜻
    ``` kotlin
    var mutableList = mutableListOf<Int>()
    // 값 넣기 -> add
    mutableList.add(11)
    mutableList.add(21)
    mutableList.add(33)
    mutableList.add(44)
    mutableList.add(122)
    Log.d("컬렉션", "mutableList = ${mutableList}")
    Log.d("컬렉션", "3번 인덱스의 값 = ${mutableList[3]} or ${mutableList.get(3)}")
    ```

    ## 맵
    - (key, value)의 쌍으로 구성
    - python의 딕셔너리인듯
    ``` kotlin
    var mutableMap = mutableMapOf<String, String>()
    mutableMap.put("키1", "값1")
    mutableMap.put("키2", "값2")
    mutableMap.put("키3", "값3")
    mutableMap.put("키4", "값4")
    Log.d("맵", "mutableMap = ${mutableMap}")
    Log.d("맵", "mutableMap 키1 = ${mutableMap["키1"]} or ${mutableMap.get("키1")}")
    ```

# 반복문
- for, while, do while문
    ## for문
    - 방법 1 - 범위로
    ``` kotlin
        for(i in 1..10){
            Log.d("loopFor", "값 = ${i}")
        }
    ```
    - 방법 2 - until
    ``` kotlin
        // until을 사용하면, 설정한 마지막 값이 빠진다.
        for(i in 1 until 10){
            Log.d("loopFor", "until을 사용하면 -> ${i}")
        }
    ```
    - 방법 3 - step
    ``` kotlin
        // step을 사용하면 넘어가는 폭을 지정한다.
        for(i in 0..10 step 2){
            Log.d("loopFor", "step을 사용하면 -> ${i}")
        }
    ```
    - 방법 4 - downTo
    ``` kotlin
        // downTo를 사용하면 감소하는 형식의 for문이 된다.
        for(i in 10 downTo 1){
            Log.d("loopFor", "downTo를 사용하면 -> ${i}")
        }
    ```
    - 방법 5 - 배열을 사용하는 방법
    ``` kotlin
        var intArray = intArrayOf(0,1,2,3,1212,5,6,7,8)
        for(i in intArray){
            Log.d("loopFor", "배열을 사용하면 -> ${i}")
        }
    ```
    ## While문
    ``` kotlin
        var cnt:Int = 0
        while(result){
            Log.d("loopWhile", "cnt = ${cnt}")
            cnt+=1
            if(cnt==10)
                break
        }
    ```

# 클래스
- 클래스는 프로퍼티(property)와 메서드(method)로 구성

    ## 클래스 작성
    ``` kotlin
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
    ```
    ## 클래스 사용
    ``` kotlin
    package com.scof.base04_class

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.util.Log

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            // 클래스 생성, 인스턴스화
            var std:Student = Student()
            
            // companion object로 감쌀경우 클래스를 생성하지 않고 사용 가능
            l.p("태그태그", std.StudentgetName()) 
            

        }
    }
    ```
    ## 상속
    - 상속을 쓰는 이유
        - 기존에 작성된 코드를 재활용하기 위함
        - 코드를 재활용하는데 체계적으로 계층 구조화해서 사용하기 위함
    - 방법
        - 작성된 부모 클래스 앞에 open 키워드를 써야한다.
    ``` kotlin
    // 클래스 부분
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
    ```
    ``` kotlin
    // 상속되었는지 확인
    package com.scof.base04_class

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.util.Log

    class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            var child = Child() // 자식 캑체 생성

            // 부모 객체에서 money 변수를 상속받음을 확인
            child.showMoney()

        }
    }
    ```

    ## 오버라이드
    - 자식 클래스에서 동일한 이름의 변수 또는 메서드를 사용할 경우에 사용
    - 오버라이드를 하기 위해서는 작성된 부모 클래스의 해당 부분(프로퍼티 or 메서드) 앞에 open 키워드를 써야한다.
    ``` kotlin
    open class Parent{
        var money = 50000000
        open var house = "강남 200평 아파트" // 자식 클래스에서 오버라이드 할 부분
    }

    class Child : Parent(){
        // 부모 클래스의 house 변수를 재정의(override) 함,
        // 메서드도 재정의 할 수 있다.
        override var house = "강남 10평 아파트"

        // 상속을 받으면 부모 클래스의 프로퍼티와 메서드를 내 것처럼 사용할 수 있다.
        fun showMoney(){
            Log.d("클래스", "money = ${money}")
        }
    }
    ```

    ## 오버로딩, 오버로드
    - 같은 이름의 메소드지만 파라미터 개수로 구분짓는 기술
    ``` kotlin
    class Son{

        // getNumber의 동일한 함수이지만, 
        // String 파라미터가 들어가면 다른 기능을 수행한다.
        fun getNumber() : Int{
            return 1
        }

        fun getNumber(param:String) : Int{
            return 2
        }
    }
    ```
# Null 처리
1. nullable (널러블)
    ``` kotlin
    // nullable이 아니기에 null 할당 불가 -> 컴파일 에러
    var disable:Int = null

    // nullable ( ?= )를 사용하여 null 할당
    var enable:Int ?= null

    // 클래스를 사용할 수도, 사용하지 않을 수도 있을 경우 
    //null로 초기화 하는 경우가 존재한다.
    var newVariable: Activity? = null
    ```
2. safety call (세이프티 콜)
    - 만약 nullable한 객체에 null이 할당되어있는데 객체의 함수를 호출할 경우 NPE (Null Pointer Exception) 오류가 발생한다. 이는 앱이 중지되는 치명적인 오류이다.
    <br><br>
    - NPE 오류 발생 코드)
        ``` kotlin
        var number ?= null

        // number=null인데, plus함수를 호출할 경우 NPE 발생
        number.plus(12)
        ```
    <br>

    - 세이프티 콜을 사용하면 객체가 null이면 함수 호출을 넘길 수 있다.
        ``` kotlin
        var number ?= null

        // number=null이기에 plus함수는 호출되지 않는다.
        number?.plus(54)
        ```
3. Elvis (엘비스)
    - 만약 세이프티 콜을 한 결과(number?.plus(12))를 다른 변수(result)에 저장할 경우
    - 세이프티 콜로 인해 함수가 호출되지 않으면 다른 변수(result)에 할당되는 것이 없으므로 오류가 발생한다.
    - 이를 방지하기 위해 엘비스 연산이 필요하다.
        ``` kotlin
        var number ?= null

        // result에는 number의 세이프티 콜로 인해 
        // plus 연산이 수행되지 않고 51이 저장된다.
        result = number?.plus(12) ?: 51
        ```

# 지연 초기화
- 특정 조건에서만 사용되는 변수가 있는 경우 미리 값을 할당하면 자원(메모리) 낭비가 된다.
- 메모리가 낭비되는 것을 막기 위해 '지연 초기화'를 사용한다.
    ## 사용방법
    1. lateinit
    2. lazy
    <br><br>
    
    ## lateinit (var)
    ``` kotlin
    // name이 사용되지 않는다면 "Scott" 값을 가진 메모리 낭비
    var name:String = "Scott"

    // lateinit를 사용하면 값을 넣지 않고 변수를 선언할 수 있다.
    lateinit var name2:String

    if(::name2.isInitialized){
        // name2가 초기화가 되었을 때만 접근할 수 있는 코드
        // :: 를 사용해야 isInitialized를 쓸 수 있다.
    }
    ```

    ## lazy (val)
    - var를 사용할 수 없다.
    - 변수가 호출되는 시점에서 초기화가 이루어지기에 '지연 초기화'라고 할 수 있다.
    ``` kotlin
    class Person{
        var name = "song"
        var age = "22"
        var address = "서울 광진구"
        var tel = "010-1234-5678"
    }

    // song은 Person 형
    // 호출되는 시점에서 메모리 할당(객체 생성)이 이루어진다.
    val song by lazy { Person() } // 아직 초기화가 이루어지지 않음

    ...

    // 호출(song.address) 이 되는 시점에 초기화가 이루어진다.
    Log.d("init_test", "${song.address}")
    ```

# 스코프 함수 (scope function)
- run, let, apply, also, with
- 여러 기능을 수행하는데 반복되는 객체의 이름을 줄이기 위해 사용된다.
- -> 코드를 간소화하는데 사용된다. <br><br>
    # 사용법
    ``` kotlin
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

    // 아래의 코드를 줄이기 위함
    seoulPeople.person.add(Person("Scott", "010-1234-5678", 19))
    seoulPeople.person.add(Person("kelly", "010-3235-5652", 20))
    seoulPeople.person.add(Person("Michael", "010-9999-5652", 23))
    ```
    ## 1. RUN
    ``` kotlin
    val resultRun = seoulPeople.person.run{
        // seoulPeople.person 생략
        // 아래의 코드를 수행하고 마지막 값을 반환, 
        // 반환값 없을 경우 true 반환
        add(Person("Scott", "010-1234-5678", 19))
        add(Person("kelly", "010-3235-5652", 20))
        add(Person("Michael", "010-9999-5652", 23))
        11 // 반환되는 값
    }
    ```
    ## 2. LET
    ``` kotlin
    val resultLet = seoulPeople.person.let{ persons ->
        // seoulPeople.person을 여기서는 persons라고 할꺼야
        // 아래의 코드를 수행하고 마지막 값을 반환, 
        // 반환값 없을 경우 true 반환
        persons.add(Person("Scott", "010-1234-5678", 19))
        persons.add(Person("kelly", "010-3235-5652", 20))
        persons.add(Person("Michael", "010-9999-5652", 23))
        "1212" // 반환되는 값
    }
    ```
    ## 3. APPLY
    ``` kotlin
    val resultApply = seoulPeople.person.apply {
        // 아래의 코드를 수행하고 person을 반환
        add(Person("Scott", "010-1234-5678", 19))
        add(Person("kelly", "010-3235-5652", 20))
        add(Person("Michael", "010-9999-5652", 23))
    }
    ```
    ## 4. ALSO
    ``` kotlin
    val resultAlso = seoulPeople.person.also { persons ->
        // 아래의 코드를 수행하고 persons를 반환
        // apply와 달리 persons로 
        persons.add(Person("Scott", "010-1234-5678", 19))
        persons.add(Person("kelly", "010-3235-5652", 20))
        persons.add(Person("Michael", "010-9999-5652", 23))
    }
    ```
    ## 5. WITH
    ``` kotlin
    package com.scof.base08_with

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import com.scof.base08_with.databinding.ActivityMainBinding

    class MainActivity : AppCompatActivity() {

        // private lateinit var binding: ActivityMainBinding
        val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

    //        binding.button.setOnClickListener{ }
    //        binding.imageView.setImageLevel(50)
    //        binding.textView.text = "반가워"

            with(binding){
                button.setOnClickListener{ }
                imageView.setImageLevel(50)
                textView.text = "반가워"
            }
        }
    }
    ```
## Log.d()
- Log.d([태그], [메시지])로 구성
    - Log.d("MainActivity", "Hello Kotlin")


# View Binding (Base00_SayHello)
- 출처 : https://offbyone.tistory.com/430
- 안드로이드 앱에서 레이아웃 내의 위젯(버튼, 텍스트뷰 등)들에 프로그램으로 접근하기 위한 방법입니다. View Binding은 Android Studio 3.6 Canary 11 이상 부터 사용할 수 있습니다(Canary 채널은 개발자들이 안드로이드 스튜디오 최신 버전을 테스트할 수 있는 빌드를 제공합니다).

    ## 방법
    1. build.gradle (Module:~) 파일에 다음 내용 추가
        ``` gradle
            android { 
                ... 
                
                buildFeatures {
                    viewBinding true 
                } 
            }
        ```
    2. 오른쪽 상단의 'Sync Now' 클릭하거나, "File -> Sync Project with Gradle files" 선택

    3. 'MainActivity.kt' 파일에서 바인딩 사용
        ``` kotlin
        package com.scof.base00_sayhello
    
        import androidx.appcompat.app.AppCompatActivity
        import android.os.Bundle
    
        // 아래의 import는 자동으로 처리된다.
        import com.scof.base00_sayhello.databinding.ActivityMainBinding
    
    
        class MainActivity : AppCompatActivity() {
            
            // 멤버 변수로 ActivityMainBinding 객체 변수 선언
            // 이후에 binding 변수를 사용하여 위젯에 접근
            private lateinit var binding: ActivityMainBinding
    
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
    
                // ActivityMainBinding 객체를 구하여 ContentView로 등록
                // ContentView는 binding의 root 뷰
                binding = ActivityMainBinding.inflate(layoutInflater)
                setContentView(binding.root)
    
                // binding을 사용하여 btnSay에 접근
                binding.btnSay.setOnClickListener{
                    binding.textSay.setText("Hello Kotlin")
                    // binding.textSay.text = "Hello Kotlin"으로 사용 가능
                }
            }
        }
        ```

    4. 조금 더 쉬운 방법
        ``` kotlin
        package com.scof.base10_edittextview

        import androidx.appcompat.app.AppCompatActivity
        import android.os.Bundle
        import com.scof.base10_edittextview.databinding.ActivityMainBinding

        class MainActivity : AppCompatActivity() {
            // private lateinit var binding: ActivityMainBinding
            // 위 코드 대신 아래 코드로 변경
            val binding by lazy { ActivityMainBinding.inflate(layoutInflater)}

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)
                
                // 아래의 setContent 설정 후, binding. 으로 접근
                setContentView(binding.root)
                binding.editText

            }
        }
        ```