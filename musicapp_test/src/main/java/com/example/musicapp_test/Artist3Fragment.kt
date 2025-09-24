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


class Artist3Fragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_artist3, container, false)
        val oasisView = rootView.findViewById<ImageView>(R.id.img_oasis)
        val travisView = rootView.findViewById<ImageView>(R.id.img_travis)
        val pulpView = rootView.findViewById<ImageView>(R.id.img_pulp)

        val items = mutableListOf(
            "Why Does It Always Rain On Me?",
            "Writing To Reach You",
            "Driftwood",
            "Turn",
            "Sing",
            "Side",
            "Flowers In The Window",
            "The Beautiful Occupation",
            "All I Want To Do Is Rock",
            "U16 Girls",
            "Happy",
            "Tied To The 90's",
            "Re-Offender",
            "The Distance",
            "Love Will Come Through ",
            "Closer",
            "My Eyes",
            "Where You Stand",
            "Coming Around",
            "More Than Us"
        )

        val rv = rootView.findViewById<RecyclerView>(R.id.songRv)
        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)


        oasisView.setTopCrop()
        travisView.setTopCrop()
        pulpView.setTopCrop()

        oasisView.setOnClickListener {
            it.findNavController().navigate(R.id.action_artist3Fragment_to_artist1Fragment)
        }
        pulpView.setOnClickListener {
            it.findNavController().navigate(R.id.action_artist3Fragment_to_artist2Fragment)
        }

        return rootView
    }


}