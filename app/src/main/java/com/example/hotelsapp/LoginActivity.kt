package com.example.hotelsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hotelsapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButtonLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
       /* if( binding.emailEditLogin.text.toString().isNotEmpty() && binding.passwordEditLogin.text.toString().isNotEmpty()) {
            binding.loginButtonLogin.backgroundTintMode = R.color.blue
        }*/

        binding.emailInputLogin.onFocusChangeListener = View.OnFocusChangeListener { v, hasFocus ->
            if (hasFocus) binding.emailEditLogin.hint = ""
        }
    }
}