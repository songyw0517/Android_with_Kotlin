package com.scof.base12_toggleswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scof.base12_toggleswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        with(binding){
            toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
                if(isChecked) textToggle.text = "On" else textToggle.text = "Off"
            }
            switchButton.setOnCheckedChangeListener { buttonView, isChecked ->
                if(isChecked) textSwitch.text = "On" else textSwitch.text = "Off"
            }
        }
    }
}