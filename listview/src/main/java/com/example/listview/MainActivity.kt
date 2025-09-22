package com.example.listview

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list_item = mutableListOf<ListViewModel>()

        list_item.add(ListViewModel("타이틀 A", "동해물과 백두산이 마르고 닳도록"))
        list_item.add(ListViewModel("타이틀 B", "하느님이 보우하사 우리나라 만세"))
        list_item.add(ListViewModel("타이틀 C", "무궁화 삼천리 화려강산"))

        val listview = findViewById<ListView>(R.id.listView)

        val listAdapter = ListViewAdapter(list_item)
        listview.adapter = listAdapter

    }
}