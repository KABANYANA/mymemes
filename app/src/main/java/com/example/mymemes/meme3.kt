package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme3)
        val next1p3= findViewById<TextView>(R.id.tv2b1)
        val next2p3=findViewById<TextView>(R.id.tv2b2)
        next1p3.setOnClickListener {
                val intent= Intent(this, Activity_meme2::class.java)
                startActivity(intent)

            }
        next2p3.setOnClickListener {
            val intent=Intent(this,meme4::class.java)
            startActivity(intent)
        }
        }
    }
