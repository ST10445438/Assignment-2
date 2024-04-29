package com.example.imad_assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnEnter = findViewById<Button>(R.id.btnEnter)

        btnEnter.setOnClickListener {
            val intent = Intent(this@MainActivity, StartPage::class.java)

            startActivity(intent)
        }
    }
}