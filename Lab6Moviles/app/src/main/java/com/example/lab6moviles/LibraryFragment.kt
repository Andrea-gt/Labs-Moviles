package com.example.lab6moviles

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class LibraryFragment : Fragment(R.layout.fragment_library) {

    private lateinit var buttonCount: ImageView
    private lateinit var likedSongsText: TextView
    private var count: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonCount = view.findViewById(R.id.addSongsButton)
        likedSongsText = view.findViewById(R.id.likedSongsText)
        setListeners()
    }

    private fun setListeners() {
        buttonCount.setOnClickListener {
            count++
            likedSongsText.text = count.toString()
        }
    }
}