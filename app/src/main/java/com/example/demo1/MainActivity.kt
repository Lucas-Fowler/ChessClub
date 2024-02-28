package com.example.demo1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        getSupportActionBar()?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 : Button = findViewById(R.id.button1)
        val button2 : Button = findViewById(R.id.button2)
        val button3 : Button = findViewById(R.id.button3)
        val button4 : Button = findViewById(R.id.button4)
        val button5 : Button = findViewById(R.id.button5)
        val button6 : Button = findViewById(R.id.button6)
        val button7 : Button = findViewById(R.id.button7)

        //About Us
        button1.setOnClickListener {
            var intent = Intent(this, AboutUs::class.java)
            startActivity(intent)
        }

        //Events
        button2.setOnClickListener {
            var intent = Intent(this, Events::class.java)
            startActivity(intent)
        }

        //Membership
        button3.setOnClickListener {
            var intent = Intent(this, Membership::class.java)
            startActivity(intent)
        }

        //Resources
        button4.setOnClickListener {
            var intent = Intent(this, Resources::class.java)
            startActivity(intent)
        }

        //Gallery
        button5.setOnClickListener {
            var intent = Intent(this, Gallery::class.java)
            startActivity(intent)
        }

        //Contact Us
        button6.setOnClickListener {
            var intent = Intent(this, ContactUs::class.java)
            startActivity(intent)
        }

        //Feedback
        button7.setOnClickListener {
            var intent = Intent(this, Feedback::class.java)
            startActivity(intent)
        }
    }
}