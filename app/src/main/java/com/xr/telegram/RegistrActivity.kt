package com.xr.telegram

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistrActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registr)
        initViews()
    }
    private fun initViews() {
        var etName = findViewById<EditText>(R.id.et_namber)
        var bPlay = findViewById<Button>(R.id.b_continue)

        bPlay.setOnClickListener {
            if (etName.text.toString().length == 10 ) {
                var intent = Intent(this, OsnovaActivity::class.java)
                intent.putExtra("name", etName.text.toString())
                startActivity(intent)
            } else {
                Toast.makeText(this, "Сперва введите номер", Toast.LENGTH_SHORT).show()
            }

        }

    }
}