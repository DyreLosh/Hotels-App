package com.example.hotelsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.hotelsapp.databinding.ActivityHomeBinding
import com.example.hotelsapp.fragments.HomeFragment
import com.example.hotelsapp.fragments.LikedFragment
import com.example.hotelsapp.fragments.MessageFragment
import com.example.hotelsapp.fragments.OrderFragment
import com.example.hotelsapp.fragments.ProfileFragment

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigation.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.homeNavigation -> supportBottomNavigation(HomeFragment())
                R.id.orderNavigation -> supportBottomNavigation(OrderFragment())
                R.id.likedNavigation -> supportBottomNavigation(LikedFragment())
                R.id.messageNavigation -> supportBottomNavigation(MessageFragment())
                R.id.profileNavigation -> supportBottomNavigation(ProfileFragment())
            }
            true
        }
    }
    private fun supportBottomNavigation(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragmentContainerView, fragment)
            .commit()
    }
}