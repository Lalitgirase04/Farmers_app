package com.example.farmers_app.ui.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.example.farmers_app.R
import com.example.farmers_app.post

private lateinit var heartBtn: ImageButton
private var isLiked = false
class MainFeed : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_main_feed, container, false)
        heartBtn = view.findViewById(R.id.like)

        heartBtn.setOnClickListener {
            isLiked = !isLiked
            heartBtn.setImageResource(
                if (isLiked) R.drawable.effectbtn else R.drawable.baseline_favorite_border_24
            )
        }
        return view
    }


    
}