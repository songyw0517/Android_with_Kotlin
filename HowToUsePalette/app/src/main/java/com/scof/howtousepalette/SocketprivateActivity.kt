package com.scof.howtousepalette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Html
import android.util.Log
import com.scof.howtousepalette.databinding.ActivitySocketprivateBinding
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.IOException
import java.net.Socket

class SocketprivateActivity : AppCompatActivity() {
    private val binding by lazy { ActivitySocketprivateBinding.inflate(layoutInflater) }
    private lateinit var client:Client
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            connectBtn.setOnClickListener {
                studyLog("connectBtn 클릭")
                var ip:String = ipEdit.text.toString()
                ip = if(ip=="") "127.0.0.1" else ip

                var portTemp = portEdit.text.toString()
                var port:Int = if(portTemp=="") 8080 else portTemp.toInt()

                studyLog("현재 ip = ${ip}, port = ${port}")
                client = Client(ip!!, port!!)
                client.connect()
            }

        }
    }
}
class Client constructor(ip:String, port:Int){
    // 소켓 통신에 필요한 것들
    private lateinit var html: Html
    private var mHandler: Handler? = null
    private var socket: Socket? = null
    private var dos: DataOutputStream? = null
    private var dis: DataInputStream? = null
    private var ip: String = ip
    private var port: Int = port

    fun connect(){
        val connection:Thread = object : Thread(){
            override fun run(){
                try{
                    socket = Socket(ip, port)
                    studyLog("소켓 생성 완료")
                } catch (e1: IOException){
                    studyLog("소켓 생성 실패\n에러메시지 : ${e1.message.toString()}")
                }
            }
        }
        connection.start()
    }
}