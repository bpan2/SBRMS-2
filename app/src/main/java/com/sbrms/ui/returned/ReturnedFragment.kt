package com.sbrms.ui.returned

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sbrms.R

class ReturnedFragment : Fragment() {

    companion object {
        fun newInstance() = ReturnedFragment()
    }

    private lateinit var viewModel: ReturnedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_returned, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ReturnedViewModel::class.java)
        // TODO: Use the ViewModel
    }

}