package com.scof.howtousepalette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scof.howtousepalette.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private val binding by lazy { ActivityFragmentBinding.inflate(layoutInflater) }
    val listFragment by lazy { ListFragment() }
    val detailFragment by lazy { DetailFragment() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setFragment()
    }

    fun setFragment(){
        // 1. 사용할 프래그먼트 생성
        // 상단 변수 선언으로 생략, val listFragment = ListFragment() // 만든 ListFragment 생성

        // 2. 트랜잭션 생성
        val transaction = supportFragmentManager.beginTransaction()

        // 3. 트랜잭션을 통해 프래그먼트 삽입
        transaction.add(R.id.frameLayout, listFragment) // frameLayout에 listFragment 추가

        // 4. 트랜잭션 커밋
        transaction.commit()


    }

    fun goDetail(){
        // 상단 변수 선언으로 생략, val detailFragment = DetailFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout, detailFragment)
        transaction.addToBackStack("detail") // 프래그먼트 동작을 스택에 넣음
        transaction.commit()
    }

    fun goBack(){
        onBackPressed()
    }

}