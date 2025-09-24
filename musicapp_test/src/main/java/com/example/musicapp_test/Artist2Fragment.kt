package com.example.musicapp_test

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.doOnLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Artist2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_artist2, container, false)
        val oasisView = rootView.findViewById<ImageView>(R.id.img_oasis)
        val travisView = rootView.findViewById<ImageView>(R.id.img_travis)
        val pulpView = rootView.findViewById<ImageView>(R.id.img_pulp)

        val items = mutableListOf(
            "Common People (Full Length Version)",
            "Disco 2000",
            "Mis-Shapes",
            "Sorted for E's & Wizz",
            "Something Changed",
            "I Spy",
            "Babies",
            "Do You Remember the First Time?",
            "Lipgloss",
            "Acrylic Afternoons",
            "Joyriders",
            "Pink Glove",
            "This Is Hardcore",
            "Help the Aged",
            "Party Hard",
            "A Little Soul",
            "The Fear",
            "Razzamatazz",
            "Countdown",
            "Bad Cover Version"
        )

        val rv = rootView.findViewById<RecyclerView>(R.id.songRv)
        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)



        oasisView.setTopCrop()
        travisView.setTopCrop()
        pulpView.setTopCrop()

        oasisView.setOnClickListener {
            it.findNavController().navigate(R.id.action_artist2Fragment_to_artist1Fragment)
        }
        travisView.setOnClickListener {
            it.findNavController().navigate(R.id.action_artist2Fragment_to_artist3Fragment)
        }


        return rootView
    }

}