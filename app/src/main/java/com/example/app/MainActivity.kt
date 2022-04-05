package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Toast
import com.example.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.button.setOnClickListener{
            binding.textInputLayout.error = validate(binding.textInputEditText.text)

            if(binding.textInputLayout.error == null){
                val intent = Intent(this@MainActivity, ThreeActivity::class.java)
                intent.putExtra("value", binding.textInputEditText.text.toString())
                startActivity(intent)
            }
        }
        binding.button2.setOnClickListener{
            val  intent = Intent(this@MainActivity, TwoActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }
    private fun validate(text: Editable?):String? = if(text?.isEmpty() == false) null else "error"
}