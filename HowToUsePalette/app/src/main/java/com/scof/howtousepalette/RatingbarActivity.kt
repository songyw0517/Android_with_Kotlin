package com.scof.howtousepalette

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.scof.howtousepalette.databinding.ActivityRatingbarBinding

class RatingbarActivity : AppCompatActivity() {
    private val binding by lazy { ActivityRatingbarBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        with(binding){
            ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
                if(fromUser) textView2.text = "$rating"
            }
            ratingBar.setOnClickListener {
                textView3.text = ratingBar.rating.toString()
            }
        }
    }
}