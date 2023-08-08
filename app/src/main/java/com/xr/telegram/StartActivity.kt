package com.xr.telegram

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StartActivity: AppCompatActivity() {
    lateinit var b_start:Button
    lateinit var iv_moon:ImageView
    lateinit var ll:LinearLayout
    lateinit var iv_sun:ImageView
    lateinit var tv_telegram:TextView
    lateinit var tv_the:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        initViews()
    }
    fun initViews(){
        b_start = findViewById(R.id.b_start)
        iv_moon = findViewById(R.id.iv_moon)
        ll = findViewById(R.id.ll_dad)
        tv_telegram = findViewById(R.id.tv_telegram)
        tv_the = findViewById(R.id.tv_the)
        b_start.setOnClickListener {
            val intent = Intent(this,RegistrActivity::class.java)
            startActivity(intent)
        }
        iv_moon.setOnClickListener {
            iv_sun.visibility = View.VISIBLE
            iv_moon.visibility = View.INVISIBLE
            ll.setBackgroundResource(R.color.black)
            tv_the.setTextColor(getColor(R.color.white))
            tv_telegram.setTextColor(getColor(R.color.white))
        }
        iv_moon.setOnClickListener {
            iv_moon.visibility = View.VISIBLE
            iv_sun.visibility = View.INVISIBLE
            ll.setBackgroundResource(R.color.white)
            tv_the.setTextColor(getColor(R.color.black))
            tv_telegram.setTextColor(getColor(R.color.black))
        }
    }
}