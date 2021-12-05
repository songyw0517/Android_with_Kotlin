package com.scof.howtousepalette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.scof.howtousepalette.databinding.ActivitySeekbarBinding

class SeekbarActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySeekbarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
                override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                    // progress bar 상태가 변경되었을시 사용되는 기능
                    // seekBar : 객체
                    // progress : 현재 탐색 구간
                    // fromUser : fromUser가 true이면 터치를 하는 것,
                    if(fromUser){ // 사람이 터치할 때만 작동
                        textView.text = "$progress"

                    }

                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {}

                override fun onStopTrackingTouch(seekBar: SeekBar?) {}

            })
        }
    }
}