package com.sbrms.ui.receiving

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sbrms.R

class ReceivingFragment : Fragment() {

    companion object {
        fun newInstance() = ReceivingFragment()
    }

    private lateinit var viewModel: ReceivingViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_receiving, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReceivingViewModel::class.java)
        // TODO: Use the ViewModel
    }

}