package com.sbrms.ui.registration

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sbrms.R
import com.sbrms.databinding.FragmentLoginBinding
import com.sbrms.databinding.FragmentRegistrationBinding
import com.sbrms.ui.login.LoginFragmentDirections

class RegistrationFragment : Fragment(R.layout.fragment_registration) {
    private var _binding: FragmentRegistrationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = RegistrationFragment()
    }

    private lateinit var viewModel: RegistrationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)

        binding.signUpButton.setOnClickListener{
            val action = RegistrationFragmentDirections.actionRegistrationFragmentToLoginFragment()
            findNavController().navigate(action)
        }

        val root: View = binding.root

        return root

        //return inflater.inflate(R.layout.fragment_registration, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RegistrationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}