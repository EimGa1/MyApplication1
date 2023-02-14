package com.example.myapplication

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {
    lateinit var email: EditText
    lateinit var passw: EditText

    private lateinit var data1: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        email = findViewById(R.id.editTextTextPersonName5)
        passw = findViewById(R.id.editTextTextPersonName6)
        data1 = getSharedPreferences(TABLE, MODE_PRIVATE)



        fun reg2(view: View) {
            if (email.text.toString().isNotEmpty()&&passw.text.toString().isNotEmpty()) {
                val inten = Intent(this, MainActivity2::class.java)
                startActivity(inten)
                finish() }
            else
            {
                finish()
            }
        }
    }

    fun reg4(view: View) {
        if (email.text.toString().isNotEmpty() && passw.text.toString().isNotEmpty()) {
            val inten = Intent(this, MainActivity2::class.java)
            startActivity(inten)
            finish()
        }
        else
        {
            finish()
        }
    }
}