package com.example.laboratorio7

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class NewAccountFragment : Fragment(R.layout.fragment_new_account){
    private lateinit var buttonCreateAccount: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonCreateAccount = view.findViewById(R.id.NewUserButton)
        setListeners()
    }
    private fun setListeners() {
        buttonCreateAccount.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_newAccountFragment_to_homeFragment)
        }
    }
}
