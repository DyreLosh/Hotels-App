package com.example.hotelsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotelsapp.R
import com.example.hotelsapp.adapters.ViewPagerAdapter
import com.example.hotelsapp.databinding.FragmentMessageBinding
import com.google.android.material.tabs.TabLayoutMediator

class MessageFragment : Fragment() {
    lateinit var binding: FragmentMessageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMessageBinding.inflate(inflater, container, false)

        val adapter = ViewPagerAdapter(this)
        binding.viewPagerMessage.adapter = adapter

        TabLayoutMediator(binding.tabLayoutMessage, binding.viewPagerMessage) { tab, position ->

            when (position) {
                0 -> tab.text = getString(R.string.message_text_tablayout)
                1 -> tab.text = getString(R.string.notification_text_tablayout)
            }
        }.attach()

        return binding.root
    }
}