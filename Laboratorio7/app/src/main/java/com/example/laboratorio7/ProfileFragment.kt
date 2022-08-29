package com.example.laboratorio7

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputEditText

class ProfileFragment : Fragment(R.layout.fragment_profile){
    private lateinit var profileInput: TextInputEditText

    private val args: ProfileFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        profileInput=view.findViewById(R.id.profileInput)

        val profileEmail = args.profileEmail
        profileInput.hint = profileEmail
    }
}