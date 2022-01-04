package com.scof.appserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Html
import android.util.Log
import android.view.View
import com.scof.appserver.databinding.ActivityMainBinding
import java.io.DataInputStream
import java.io.DataOutputStream
import java.io.IOException
import java.lang.Exception
import java.net.Socket
import java.util.concurrent.ConcurrentLinkedDeque

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var client:Client
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding) {
            btnConnect.setOnClickListener {
                Log.d("서버", "클릭")
                // ip, port가 빈칸일때 처리
                var ip:String = editIp.text.toString()
                ip = if(ip=="") "127.0.0.1" else ip // edit Text가 빈칸일 경우

                var portTemp = editPort.text.toString()
                var port:Int = if(portTemp=="") 8080 else portTemp.toInt()


                Log.d("서버", "현재 ip = ${ip}, port = ${port} daf")
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
                    Log.d("서버","연결 성공")
                } catch (e1: IOException){
                    Log.d("서버","연결 실패")
                }
            }
        }
        connection.start()
    }
}