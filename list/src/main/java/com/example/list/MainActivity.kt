package com.example.list

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var testList = mutableListOf<String>()

        testList.add("a")
        testList.add("b")
        testList.add("c")

        Log.d("나아앙", testList[0])
        Log.d("나아앙", testList[1])
        Log.d("나아앙", testList[2])
    }
}