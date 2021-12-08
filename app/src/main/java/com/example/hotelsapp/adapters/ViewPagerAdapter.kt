package com.example.hotelsapp.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hotelsapp.fragments.IncomingFragment
import com.example.hotelsapp.fragments.MessageFragment
import com.example.hotelsapp.fragments.NotificationFragment

class ViewPagerAdapter(fragment: MessageFragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount() = 2

    override fun createFragment(position: Int): Fragment {

       return if(position == 0){
           IncomingFragment()
       }
        else {
            NotificationFragment()
       }
    }
}
