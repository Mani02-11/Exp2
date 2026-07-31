package com.example.exp2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Custom.showToast(this, "Welcome! App is Created")
    }

    override fun onStart() {
        super.onStart()
        Custom.showToast(this, "App is Starting")
    }

    override fun onResume() {
        super.onResume()
        Custom.showToast(this, "App is Running")
    }

    override fun onPause() {
        super.onPause()
        Custom.showToast(this, "App is Paused")
    }

    override fun onStop() {
        super.onStop()
        Custom.showToast(this, "App is Stopped")
    }

    override fun onRestart() {
        super.onRestart()
        Custom.showToast(this, "App is Restarting")
    }

    override fun onDestroy() {
        super.onDestroy()
        Custom.showToast(this, "App is Closed")
    }
}