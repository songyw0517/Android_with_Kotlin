package com.scof.base13_progressbar

import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.scof.base13_progressbar.databinding.ActivityMainBinding
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    private val binding by lazy{ ActivityMainBinding.inflate(layoutInflater)}
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