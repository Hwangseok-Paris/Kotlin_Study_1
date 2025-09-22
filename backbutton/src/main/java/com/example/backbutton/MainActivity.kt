package com.example.backbutton

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    private var isDouble = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pressback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {

                if(isDouble){
                    finish()
                } else {
                    isDouble = true
                    Toast.makeText(this@MainActivity, "종료하려면 더블 클릭", Toast.LENGTH_SHORT).show()
                    Handler().postDelayed(Runnable{
                        isDouble = false
                    }, 2000)

                }
            }
        }

        onBackPressedDispatcher.addCallback(this, pressback)

    }



}