package com.example.hotelsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotelsapp.R
import com.example.hotelsapp.databinding.FragmentIncomingBinding

class IncomingFragment : Fragment() {

    lateinit var binding: FragmentIncomingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentIncomingBinding.inflate(inflater, container, false)

        return binding.root
    }
}