package com.scof.howtousepalette

import android.app.Dialog
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import com.scof.howtousepalette.databinding.ActivityEdittextBinding
class EdittextActivity : AppCompatActivity() {
    val binding by lazy { ActivityEdittextBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        title = "EditText" // 최상단 제목 변경
        
        with(binding){
            edit.addTextChangedListener { 
                // edit의 내용이 변경되었을 때의 코드
                Log.d("study", "텍스트 내용 변경 = ${edit.text}")
                showChange.text = edit.text
            }
            sendBtn.setOnClickListener {
                // 버튼이 클릭되었을 때의 코드
                val dialog = customDialog(this@EdittextActivity) // 다이얼로그 생성, 왜 this@~~가 들어가는지는 모른다.
                dialog.showDialog(edit.text.toString()) // 다이얼로그 보여주기, edit.text.toString()으로 텍스트 전달
                Log.d("study", "버튼 클릭 = 전달된 내용 = ${edit.text.toString()}")

            }

        }
    }
}
class customDialog (context: Context){
    private val dialog = Dialog(context)
    init {
        dialog.setContentView(R.layout.dialog_custom1)
        dialog.window!!.setLayout(WindowManager.LayoutParams.MATCH_PARENT,
        WindowManager.LayoutParams.WRAP_CONTENT)
        dialog.setCanceledOnTouchOutside(true)
        dialog.setCancelable(true)
    }
    fun showDialog(text:String){
        var textDialog = dialog.findViewById<TextView>(R.id.textDialog)
        textDialog.text = text
        dialog.show()
    }
}