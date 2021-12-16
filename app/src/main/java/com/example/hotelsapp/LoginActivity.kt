package com.example.hotelsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelsapp.databinding.ActivityLoginBinding
import com.example.hotelsapp.validator.Validator

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButtonLogin.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
        binding.loginButtonLogin.setOnClickListener {
            verificationLogin(binding)
        }
    }

    private fun verificationLogin(binding: ActivityLoginBinding) {
        val email = binding.emailEditLogin
        val password = binding.passwordEditLogin
        val emailInputLayout = binding.emailInputLogin
        val passwordInputLayout = binding.passwordInputLogin
        val validate = Validator(this)

        binding.emailInputLogin.error = validate.validateEmail(email)
        passwordInputLayout.error = validate.validatePassword(password)

        if (emailInputLayout.error == null &&
            passwordInputLayout.error == null
        ) {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("Name", email.text.toString())
            startActivity(intent)
            finish()
        }
    }
}