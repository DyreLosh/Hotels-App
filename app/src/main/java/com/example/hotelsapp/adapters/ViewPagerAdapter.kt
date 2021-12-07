package com.example.hotelsapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hotelsapp.fragments.IncomingFragment
import com.example.hotelsapp.fragments.MessageFragment
import com.example.hotelsapp.fragments.NotificationFragment

class ViewPagerAdapter(fragment: MessageFragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {

       return when(position) {
            0 -> IncomingFragment()
            1 -> NotificationFragment()
            else -> Fragment()
        }
    }
}