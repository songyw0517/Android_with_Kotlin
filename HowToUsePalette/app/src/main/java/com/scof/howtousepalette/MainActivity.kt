package com.scof.howtousepalette

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.scof.howtousepalette.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            // 버튼 누르면 그 액티비티로 넘어가는 기능만 수행
            editText.setOnClickListener {
                val intent = Intent(this@MainActivity, EdittextActivity::class.java)
                startActivity(intent)
            }
            checkBox.setOnClickListener {
                val intent = Intent(this@MainActivity, CheckboxActivity::class.java)
                startActivity(intent)
            }
            Radio.setOnClickListener {
                val intent = Intent(this@MainActivity, RadioActivity::class.java)
                startActivity(intent)
            }
            progressBar.setOnClickListener {
                val intent = Intent(this@MainActivity, ProgressbarActivity::class.java)
                startActivity(intent)
            }
            toggleSwitch.setOnClickListener {
                val intent = Intent(this@MainActivity, ToggleswitchActivity::class.java)
                startActivity(intent)
            }
            seekBar.setOnClickListener {
                val intent = Intent(this@MainActivity, SeekbarActivity::class.java)
                startActivity(intent)
            }
            RatingBar.setOnClickListener {
                val intent = Intent(this@MainActivity, RatingbarActivity::class.java)
                startActivity(intent)
            }
            changeView.setOnClickListener {
                val intent = Intent(this@MainActivity, SubActivity::class.java)
                
                // intent에 값을 보냄
                intent.putExtra("from1", "Hello bundle")
                intent.putExtra("from2", 2021)
                // startActivity(intent) 액티비티만 실행
                startActivityForResult(intent, 99) // intent와 요청코드 전달
            }
            spinner.setOnClickListener {
                val intent = Intent(this@MainActivity, SpinnerActivity::class.java)
                startActivity(intent)
            }



        }
    }

    // changeView 부분에서 발생한 값을 처리하는 부분
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        // resultCode -> sub에서 보내는 result코드
        // requestCode -> main에서 요청하는 request코드
        // data -> sub에서 보내는 데이터
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK){ // resultCode가 OK인지 확인
            when(requestCode) {
                99 -> {
                    // data에서 returnValue 를 가진 문자열을 가져온다.
                    // data에서 꺼낸 값이 있을 경우 let 스코프 함수가 실행된다.
                    // 
                    data?.getStringExtra("returnValue")?.let { message ->
                        Toast.makeText(this, message, Toast.LENGTH_SHORT).show() // 이부분은 뭐지 (토스트 메시지!)

                    }
                }
            }
        }
    }
}