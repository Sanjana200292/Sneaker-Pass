package com.example.sneakerpass

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.bottomnavigation.BottomNavigationView

class home : AppCompatActivity()
{
    private lateinit var bottom_navigation: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        bottom_navigation = findViewById(R.id.bottom_navigation)
        bottom_navigation.setOnItemReselectedListener()
        { item ->
            when(item.itemId)
            {
                R.id.item_1 ->
                {
                    // Respond to navigation item 1 reselection
                    val intent = Intent(this,home::class.java)
                    startActivity(intent)
                }
                R.id.item_2 ->
                {
                    // Respond to navigation item 2 reselection
                    val intent = Intent(this,myprofile::class.java)
                    startActivity(intent)
                }
                R.id.item_3 ->
                {
                    // Respond to navigation item 2 reselection
                    val intent = Intent(this,cart::class.java)
                    startActivity(intent)
                }
                R.id.item_4 ->
                {
                    // Respond to navigation item 2 reselection
                    val intent = Intent(this,Brand::class.java)
                    startActivity(intent)
                }
            }
        }
    }

    fun onClick(v: View) {

        val intent = Intent(this,detail::class.java)
        startActivity(intent)

    }

    fun onclick(v: View) {

        val intent = Intent(this,Brand::class.java)
        startActivity(intent)
    }
}