package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app.databinding.ActivityThreeBinding

class ThreeActivity : AppCompatActivity() {
    lateinit var binding : ActivityThreeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getText = intent.extras?.getString("value")

        binding.setTextView.text = getText
    }
}