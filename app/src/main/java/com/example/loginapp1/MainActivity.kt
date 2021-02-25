package com.example.loginapp1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var button1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.button1) as Button
        button1!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, HomePage::class.java)
            startActivity(intent)
        })
    }
}