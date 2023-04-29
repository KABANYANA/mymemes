package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activity_meme2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme2)
        val next1p2=findViewById<TextView>(R.id.tv1b1)
        val next2p2=findViewById<TextView>(R.id.tv1b2)
        next1p2.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        next2p2.setOnClickListener {
            val intent=Intent(this,meme3::class.java)
            startActivity(intent)
        }
    }
}