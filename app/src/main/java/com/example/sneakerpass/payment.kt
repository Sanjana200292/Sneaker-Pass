package com.example.sneakerpass

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class payment : AppCompatActivity() {

    private lateinit var button11:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button11 = findViewById(R.id.button11)

        button11.setOnClickListener {
            val intent = Intent( this,secc::class.java)
            startActivity(intent)
        }
    }
    fun oNClick(v: View) {
        val intent = Intent(this, Brand::class.java)
        startActivity(intent)
    }
}