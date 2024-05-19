package com.example.ingles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ProgressBar
import android.window.SplashScreen
import kotlinx.coroutines.newFixedThreadPoolContext
import android.content.Intent
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish() // Finaliza esta actividad para evitar que el usuario vuelva atrás
        }, 2000) // 3000 milisegundos = 3 segundos
    }
}
