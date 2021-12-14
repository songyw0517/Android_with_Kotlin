package com.scof.howtousepalette

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.scof.howtousepalette.databinding.FragmentListBinding

class ListFragment : Fragment() {
    lateinit var binding:FragmentListBinding
    lateinit var FragmentActivity: FragmentActivity
    override fun onAttach(context: Context) {
        super.onAttach(context) // context : 호출한 액티비티

        if (context is FragmentActivity){
            FragmentActivity = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(inflater, container, false) // 바인딩 생성

        // Inflate the layout for this fragment
        return binding.root // root 반환
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.nextBtn.setOnClickListener {
            FragmentActivity.goDetail()
        }
    }
}