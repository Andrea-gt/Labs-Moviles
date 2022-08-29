package com.example.laboratorio7

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs

class HomeFragment : Fragment(R.layout.fragment_home){
    private lateinit var buttonProfile: Button
    private lateinit var homeMailText: TextView

    private val args: HomeFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        homeMailText=view.findViewById(R.id.homeMailText)
        buttonProfile = view.findViewById(R.id.UpdateProfile)

        val userEmail = args.userEmail
        homeMailText.text = userEmail
        setListeners()
    }
    private fun setListeners() {
        buttonProfile.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment(
                profileEmail = args.userEmail
            )
            requireView().findNavController().navigate(action)
        }
    }
}