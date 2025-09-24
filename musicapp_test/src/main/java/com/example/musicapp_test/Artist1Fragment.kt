package com.example.musicapp_test

import android.graphics.Matrix
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.view.doOnLayout
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Artist1Fragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_artist1, container, false)
        val oasisView = rootView.findViewById<ImageView>(R.id.img_oasis)
        val travisView = rootView.findViewById<ImageView>(R.id.img_travis)
        val pulpView = rootView.findViewById<ImageView>(R.id.img_pulp)


        val items = mutableListOf(
        "Wonderwall",
        "Don't Look Back in Anger",
        "Champagne Supernova",
        "Some Might Say",
        "Roll with It",
        "Morning Glory",
        "Live Forever",
        "Supersonic",
        "Cigarettes & Alcohol",
        "Rock 'n' Roll Star",
        "Slide Away",
        "The Masterplan",
        "Acquiesce",
        "Half The World Away",
        "Stand by Me",
        "Don't Go Away",
        "Stop Crying Your Heart Out",
        "Little By Little",
        "Lyla",
        "The Shock Of The Lightning"
        )




        val rv = rootView.findViewById<RecyclerView>(R.id.songRv)
        val rvAdapter = RVAdapter(items)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        // 3. 찾은 imageView가 null이 아닐 경우에만 TopCrop 로직을 적용합니다.

        oasisView.setTopCrop()
        travisView.setTopCrop()
        pulpView.setTopCrop()


        pulpView.setOnClickListener {
            it.findNavController().navigate(R.id.action_artist1Fragment_to_artist2Fragment)
        }
        travisView.setOnClickListener {
            it.findNavController().navigate(R.id.action_artist1Fragment_to_artist3Fragment)
        }


        return rootView
    }


}

