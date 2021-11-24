package com.example.hotelsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelsapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}