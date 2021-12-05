package com.scof.howtousepalette

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scof.howtousepalette.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            to1.text = intent.getStringExtra("from1") // intent에서 값을 받아올건데 String형이야, 그리고 name은 from1이야
            to2.text = "${intent.getIntExtra("from2", 0)}" // intent에서 값을 받아올건데, Int형이야, 그리고 name은 from2인데, 값이 없으면 0으로 처리할거야

            btnClose.setOnClickListener {
                val returnIntent = Intent() // 전달하려는 인텐트 생성
                val message = editMessage.text.toString() // 인텐트에 전달할 메시지
                returnIntent.putExtra("returnValue", message) // 인텐트에 전달할 메시지 넣기
                setResult(RESULT_OK, returnIntent) // RESULT_OK로 정상적으로 종료됨을 알림, 전달하려는 인텐트 전달
                finish()
            }
        }

    }


}