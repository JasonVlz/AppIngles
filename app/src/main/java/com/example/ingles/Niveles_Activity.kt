package com.example.ingles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Niveles_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_niveles)

        val button = findViewById<Button>(R.id.btnnivelA1_1)


        button.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.btnnivelA1_2)


        button1.setOnClickListener {
            val intent = Intent(this, nivelA12::class.java)
            startActivity(intent)
        }
    }
}