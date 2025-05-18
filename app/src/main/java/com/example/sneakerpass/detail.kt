package com.example.sneakerpass

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detail : AppCompatActivity() {

    private lateinit var button8:Button
    private lateinit var button9:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button8 = findViewById(R.id.button8)

        button8.setOnClickListener {
            val intent = Intent( this,cart::class.java)
            startActivity(intent)
        }

        button9 = findViewById(R.id.button9)

        button9.setOnClickListener {
            val intent = Intent( this,payment::class.java)
            startActivity(intent)
        }
    }

    fun Oclick(v: View) {
        val intent = Intent(this, home::class.java)
        startActivity(intent)

    }
}