package com.xr.telegram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
     var isMain=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    private fun initViews() {
        Handler().postDelayed({
            openStartActivity()
        }, 2000)
    }

    private fun openStartActivity() {
        if (isMain){
            val intent = Intent(this, OsnovaActivity::class.java)
            startActivity(intent)
            finish()
        }else{
            val intent = Intent(this,StartActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}