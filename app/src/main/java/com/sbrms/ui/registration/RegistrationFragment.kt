package com.sbrms.ui.registration

import android.app.Activity
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.sbrms.R
import com.sbrms.databinding.FragmentLoginBinding
import com.sbrms.databinding.FragmentRegistrationBinding
import com.sbrms.ui.login.LoginFragmentDirections
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationFragment : Fragment(R.layout.fragment_registration) {
    private lateinit var binding: FragmentRegistrationBinding
    private val viewModel: RegistrationViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_registration, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.registerViewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        binding.apply {
            registerButton.setOnClickListener{
                viewModel.onRegisterBtnClick()
                val action = RegistrationFragmentDirections.actionRegistrationFragmentToLoginFragment()
                findNavController().navigate(action)
            }
        }
    }

}