package com.example.demo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Feedback : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)
        val back8 : Button = findViewById(R.id.back8)
        back8.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val back7 : Button = findViewById(R.id.back7)
        back7.setOnClickListener {
            var intent = Intent(this, Feedback::class.java)
            startActivity(intent)
        }
        /*button.setOnClickListener {
        val currentText: String = editText.text.toString()
        Log.d("DebugEditText", currentText)
        textView.text = currentText
    }*/
    }
}