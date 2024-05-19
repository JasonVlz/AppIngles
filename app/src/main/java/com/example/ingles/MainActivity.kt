package com.example.ingles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.btnnivel)


        button.setOnClickListener {
            val intent = Intent(this, Niveles_Activity::class.java)
            startActivity(intent)
        }
        val button1 = findViewById<Button>(R.id.btnRegistro)

        button1.setOnClickListener {
            val intent = Intent(this, registro_Activity ::class.java)
            startActivity(intent)
        }
    }
    }
