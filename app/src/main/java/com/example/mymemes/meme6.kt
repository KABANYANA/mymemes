package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme6)
        val next1p5 = findViewById<TextView>(R.id.tv5b1)
        val next2p5 = findViewById<TextView>(R.id.tv5b2)
        next1p5.setOnClickListener {
            val intent = Intent(this, meme4::class.java)
            startActivity(intent)
        }
        next2p5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}