package com.example.sneakerpass

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {

    private lateinit var button4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button4 = findViewById(R.id.button4)

        button4.setOnClickListener {
            val intent = Intent( this,home::class.java)
            startActivity(intent)
        }
    }



//    var click = false

    fun onClick(v:View) {
//        if (click==false){
//            click = true
            val intent= Intent(this,register::class.java)
            startActivity(intent)
//        }else{
//            Toast.makeText(this,"You alraedy cliked",Toast.LENGTH_SHORT).show()
//        }

    }
}