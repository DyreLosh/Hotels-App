package com.example.hotelsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
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
                R.id.homeNavigation -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, HomeFragment())
                        .commit()
                    binding.toolbar.isVisible = false
                }
                R.id.orderNavigation -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, OrderFragment())
                        .commit()
                }
                R.id.likedNavigation -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, LikedFragment())
                        .commit()
                }
                R.id.messageNavigation -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, MessageFragment())
                        .commit()
                }
                R.id.profileNavigation -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainerView, ProfileFragment())
                        .commit()
                }
            }
            true
        }
    }
}