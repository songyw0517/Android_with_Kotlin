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
>    ``` kotlin
>    package com.scof.base00_sayhello
>
>    import androidx.appcompat.app.AppCompatActivity
>    import android.os.Bundle
>
>    // 아래의 import는 자동으로 처리된다.
>    import com.scof.base00_sayhello.databinding.ActivityMainBinding
>
>
>    class MainActivity : AppCompatActivity() {
>        
>        // 멤버 변수로 ActivityMainBinding 객체 변수 선언
>        // 이후에 binding 변수를 사용하여 위젯에 접근
>        private lateinit var binding: ActivityMainBinding
>
>        override fun onCreate(savedInstanceState: Bundle?) {
>            super.onCreate(savedInstanceState)
>            setContentView(R.layout.activity_main)
>
>            // ActivityMainBinding 객체를 구하여 ContentView로 등록
>            // ContentView는 binding의 root 뷰
>            binding = ActivityMainBinding.inflate(layoutInflater)
>            setContentView(binding.root)
>
>            // binding을 사용하여 btnSay에 접근
>            binding.btnSay.setOnClickListener{
>                binding.textSay.setText("Hello Kotlin")
>                // binding.textSay.text = "Hello Kotlin"으로 사용 가능
>            }
>        }
>    }
>    ```

## 코드
>``` kotlin
> // MainActivity.kt
>    package com.scof.base00_sayhello
>
>    import androidx.appcompat.app.AppCompatActivity
>    import android.os.Bundle
>    import com.scof.base00_sayhello.databinding.ActivityMainBinding
>
>
>    class MainActivity : AppCompatActivity() {
>        // ActivityMainBinding 형
>        private lateinit var binding: ActivityMainBinding 
>
>        override fun onCreate(savedInstanceState: Bundle?) {
>            super.onCreate(savedInstanceState)
>            setContentView(R.layout.activity_main)
>
>            binding = ActivityMainBinding.inflate(layoutInflater)
>            setContentView(binding.root) // ActivityMain.xml의 루트로 설정
>
>            /*btnSay 클릭 리스너*/
>            binding.btnSay.setOnClickListener{
>                binding.textSay.text = "Hello Kotlin"
>                // setText 사용가능하지만 지양
>            }
>        }
>    }
>    ```
    

# 패키지 이름은 example이 아닌 것으로
- 그렇지 않으면(패키지 이름이 example이면) 플레이스토어에 올라갈 수 없다.

# 함수들
- Log.d

# 객체들
## TextView
## Button
## ImageView