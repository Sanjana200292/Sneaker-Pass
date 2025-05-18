package com.example.sneakerpass

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class nike : AppCompatActivity() {

    private lateinit var button6:Button

    private lateinit var button7:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nike)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button6 = findViewById(R.id.button6)

        button6.setOnClickListener {
            val intent = Intent( this,cart::class.java)
            startActivity(intent)
        }

        button7 = findViewById(R.id.button7)

        button7.setOnClickListener {
            val intent = Intent( this,payment::class.java)
            startActivity(intent)
        }
    }

    fun oclick(v: View) {

        val intent = Intent(this,Brand::class.java)
        startActivity(intent)
    }
}