package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val next1= findViewById<TextView>(R.id.tv12)

        next1.setOnClickListener {
            val intent=Intent(this, Activity_meme2::class.java)
            startActivity(intent)

        }

    }
}