package com.xr.telegram

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StartActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        initViews()
    }
    private fun initViews() {
        val intent = Intent(this, RegistrActivity::class.java)
        startActivity(intent)
        finish()
    }
}