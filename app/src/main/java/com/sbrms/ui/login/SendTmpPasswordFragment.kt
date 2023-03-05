package com.sbrms.ui.login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sbrms.R

class SendTmpPasswordFragment : Fragment() {

    companion object {
        fun newInstance() = SendTmpPasswordFragment()
    }

    private lateinit var viewModel: SendTmpPassowrdViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_send_tmp_password, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SendTmpPassowrdViewModel::class.java)
        // TODO: Use the ViewModel
    }

}