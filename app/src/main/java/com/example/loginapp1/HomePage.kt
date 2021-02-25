package com.example.loginapp1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class HomePage : AppCompatActivity() {
    var button2: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        button2 = findViewById(R.id.button2) as Button
        button2!!.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@HomePage, MainActivity::class.java)
            startActivity(intent)
        })
    }
}