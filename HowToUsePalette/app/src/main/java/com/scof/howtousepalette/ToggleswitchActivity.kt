package com.scof.howtousepalette

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.scof.howtousepalette.databinding.ActivityToggleswitchBinding

class ToggleswitchActivity : AppCompatActivity() {
    private val binding by lazy { ActivityToggleswitchBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
                // isChecked는 체크가 되었는지, 아닌지
                if(isChecked) {
                    textToggle.text = "On"
                    buttonView.setBackgroundColor(Color.parseColor("#afe3ff"))
                } else {
                    textToggle.text = "Off"
                    buttonView.setBackgroundColor(Color.parseColor("#000000"))
                }

            }
            switchButton.setOnCheckedChangeListener { buttonView, isChecked ->
                // switch에서도 동일, isChecked는 체크가 되었는지, 아닌지
                if(isChecked) textSwitch.text = "On" else textSwitch.text = "Off"
            }
        }
    }
}