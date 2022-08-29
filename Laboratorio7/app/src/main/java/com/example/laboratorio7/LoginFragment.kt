package com.example.laboratorio7

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginFragment : Fragment(R.layout.fragment_login){
    private lateinit var buttonLogin: Button
    private lateinit var buttonCreate: TextView
    private lateinit var emailInput: TextInputEditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogin = view.findViewById(R.id.LoginButton)
        buttonCreate = view.findViewById(R.id.mainactivity_NeedUserText)
        emailInput = view.findViewById(R.id.mainInput_EditText)
        setListeners()
    }

    private fun setListeners() {
        buttonLogin.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToHomeFragment(
                userEmail = emailInput.editableText!!.toString()
            )
            if(emailInput.editableText!!.toString() =="jcdurini@uvg.edu.gt") {
                requireView().findNavController().navigate(action)
            }
            else{
                Toast.makeText(this.getContext(), "El correo no existe" , Toast.LENGTH_SHORT ).show();
            }
        }
        buttonCreate.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_loginFragment_to_newAccountFragment)
        }
    }
}