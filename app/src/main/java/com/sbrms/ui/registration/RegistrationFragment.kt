package com.sbrms.ui.registration

import android.app.Activity
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sbrms.R
import com.sbrms.databinding.FragmentLoginBinding
import com.sbrms.databinding.FragmentRegistrationBinding
import com.sbrms.ui.login.LoginFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationFragment : Fragment(R.layout.fragment_registration) {

    private lateinit var viewModel: RegistrationViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = ViewModelProvider(this).get(RegistrationViewModel::class.java)

        val binding = FragmentRegistrationBinding.bind(view)

        binding.apply {
          /*  employeeIDOutlinedTextField.editText?.setText(viewModel.employeeID.toString())
            userNameOutlinedTextField.editText?.setText(viewModel.userName)
            emailOutlinedTextField.editText?.setText(viewModel.email)
            passwordOutlinedTextField.editText?.setText(viewModel.password)
          */
            registerButton.setOnClickListener{
                /*
                viewModel.userName = userNameOutlinedTextField.editText?.text.toString()
                viewModel.email = emailOutlinedTextField.editText?.text.toString()
                viewModel.password = passwordOutlinedTextField.editText?.text.toString()
                */

                viewModel.onRegisterBtnClick()

                val action = RegistrationFragmentDirections.actionRegistrationFragmentToLoginFragment()
                findNavController().navigate(action)
            }
        }
    }

}