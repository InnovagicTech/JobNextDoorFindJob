package com.example.jobnextdoorfindjob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val i = Intent(this@SplashActivity, LoginActivity::class.java)
            startActivity(i) //start new activity
            finish()
        }, 3000) //time in milliseconds
    }
}