package com.example.listview_second

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        var list_item = mutableListOf<String>()
//
//        list_item.add("A")
//        list_item.add("B")
//        list_item.add("C")

        val list_item2 = mutableListOf<ListViewModel>()
        list_item2.add(ListViewModel("a","b"))
        list_item2.add(ListViewModel("c","d"))
        list_item2.add(ListViewModel("e","f"))
        list_item2.add(ListViewModel("g","h"))
        list_item2.add(ListViewModel("i","j"))


        val listView = findViewById<ListView>(R.id.listView)
        var listViewAdapter = ListViewAdapter(list_item2)

        listView.adapter = listViewAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, list_item2[position].text1, Toast.LENGTH_SHORT).show()
        }

    }
}