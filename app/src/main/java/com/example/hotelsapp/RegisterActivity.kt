package com.example.hotelsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelsapp.databinding.ActivityHomeBinding
import com.example.hotelsapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}