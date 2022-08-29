package com.example.laboratorio7

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputEditText

class NewAccountFragment : Fragment(R.layout.fragment_new_account){
    private lateinit var buttonCreateAccount: Button
    private lateinit var emailInput: TextInputEditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonCreateAccount = view.findViewById(R.id.NewUserButton)
        emailInput= view.findViewById(R.id.textInputEditText)
        setListeners()
    }
    private fun setListeners() {
        buttonCreateAccount.setOnClickListener {
            val action = NewAccountFragmentDirections.actionNewAccountFragmentToHomeFragment(
                userEmail = emailInput.editableText!!.toString()
            )
            requireView().findNavController().navigate(action)
        }
    }
}
