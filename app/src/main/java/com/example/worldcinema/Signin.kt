package com.example.worldcinema

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_signin.*

class Signin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        /*reg.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }*/

        val btnin: FrameLayout
        btnin = findViewById(R.id.reg)

        btnin.setOnClickListener{
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }
    }


}