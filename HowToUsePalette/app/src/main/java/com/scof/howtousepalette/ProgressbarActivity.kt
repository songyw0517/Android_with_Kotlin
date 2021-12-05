package com.scof.howtousepalette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.scof.howtousepalette.databinding.ActivityProgressbarBinding
import kotlin.concurrent.thread

class ProgressbarActivity : AppCompatActivity() {
    private val binding by lazy { ActivityProgressbarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            // 메인 스레드
            showProgress(true)
            thread(start = true){ // 서브 스레드
                Thread.sleep(3000)

                // 화면에 미치는 코드 -> runOnUiThread
                runOnUiThread {
                    // progressBar.visibility = View.GONE
                    showProgress(false)
                }
            }
        }
    }
    fun showProgress(show:Boolean){
        binding.progressLayout.visibility = if(show) View.VISIBLE else View.GONE
    }
}