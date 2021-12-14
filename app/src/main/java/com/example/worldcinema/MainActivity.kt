package com.example.worldcinema

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.worldcinema.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    /*private fun init(){
        binding.apply {
            rcView.layoutManager =
        }

    }*/
}