package com.xr.telegram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    private fun initViews() {
        Handler().postDelayed({
            openStartActivity()
        }, 3000)
    }

    private fun openStartActivity() {
        val intent = Intent(this, StartActivity::class.java)
        startActivity(intent)
        finish()
    }
}