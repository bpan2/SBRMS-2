package com.sbrms.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sbrms.R
import com.sbrms.databinding.FragmentLoginBinding
import com.sbrms.databinding.FragmentSlideshowBinding
import com.sbrms.ui.home.HomeFragment
import com.sbrms.ui.home.HomeFragmentDirections
import com.sbrms.ui.slideshow.SlideshowViewModel

class LoginFragment : Fragment(R.layout.fragment_login){
    private var _binding: FragmentLoginBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //disable the display of up-button on Login Screen's Action Bar
        (activity as AppCompatActivity).supportActionBar?.setDisplayHomeAsUpEnabled(false)

        val slideshowViewModel = ViewModelProvider(this).get(SlideshowViewModel::class.java)

        _binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.signInButton.setOnClickListener{
            val action = LoginFragmentDirections.actionLoginFragmentToNavHome()
            findNavController().navigate(action)
        }


        binding.logInPageRegisterButton.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToRegistrationFragment()
            findNavController().navigate(action)
        }

        binding.forgotYourPasswordButton.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToSendTmpPasswordFragment()
            findNavController().navigate(action)
        }

        /*binding.signInButton.setOnClickListener{
            val action = LoginFragmentDirections.actionLoginFragmentToNavHome()
            findNavController().navigate(action)
        }
        binding.register.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToRegistrationFragment()
            findNavController().navigate(action)
        }
        binding.forgotPassword.setOnClickListener {
            val action = LoginFragmentDirections.actionLoginFragmentToSendTmpPassowrdFragment()
            findNavController().navigate(action)
        }
        */

        val root: View = binding.root

       /* val textView: TextView = binding.textSlideshow
        slideshowViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }*/
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}