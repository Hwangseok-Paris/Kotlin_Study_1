package com.example.kotlin_study_1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ars_image = findViewById<ImageView >(R.id.ars)
        var liv_image = findViewById<ImageView>(R.id.liv)
        ars_image.setOnClickListener {
            Toast.makeText(this, "아스날 우승!!", Toast.LENGTH_LONG).show()

        val intent = Intent(this, EplLogo1::class.java)
            startActivity(intent)


        liv_image.setOnClickListener {
            Toast.makeText(this, "리버풀 3위!!!", Toast.LENGTH_LONG).show()

            val intent = Intent(this, EplLogo2::class.java)
            startActivity(intent)
        }
        }
    }
}