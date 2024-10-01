package com.friska.japan_wisata

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btnDetails : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDetails = findViewById(R.id.btnDetails)

        // Set button click listener
        btnDetails.setOnClickListener {
            // Navigate to DetailActivity (you can replace it with your destination)
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
    }
}