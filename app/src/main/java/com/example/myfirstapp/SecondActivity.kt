package com.example.myfirstapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvWelcome = findViewById<TextView>(R.id.tvWelcome)

        val intent = intent

        val bundle = intent.extras

        if (bundle != null) {

            val userName = bundle.getString("USER_NAME")

            if (userName !=null && userName.isNotEmpty()){
                tvWelcome.text = "Bienvenue, $userName"
            }
        }
    }
}