package com.example.mymemes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class meme4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meme4)
        var next1p4=findViewById<TextView>(R.id.tv3b1)
        var next2p4=findViewById<TextView>(R.id.tv3b2)
        next1p4.setOnClickListener {
            val intent= Intent(this, meme3::class.java)
            startActivity(intent)
        }
        next2p4.setOnClickListener {
            val intent= Intent(this, meme6::class.java)
            startActivity(intent)
        }
    }
}