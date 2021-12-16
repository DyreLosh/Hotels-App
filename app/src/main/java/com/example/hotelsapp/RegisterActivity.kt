package com.example.hotelsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hotelsapp.databinding.ActivityHomeBinding
import com.example.hotelsapp.databinding.ActivityRegisterBinding
import com.example.hotelsapp.validator.Validator

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButtonRegister.setOnClickListener{

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.registerButtonRegister.setOnClickListener {

            verificationRegister(binding)
        }
    }

    private fun verificationRegister(binding: ActivityRegisterBinding) {
        val emailInputLayout = binding.emailInputRegister
        val passwordInputLayout = binding.passwordInputRegister
        val usernameInputLayout = binding.userInputRegister
        val phoneInputLayout = binding.phoneInputRegister
        val validate = Validator(this)

        usernameInputLayout.error = validate.validateName(binding.userEditRegister)
        emailInputLayout.error = validate.validateEmail(binding.emailEditRegister)
        passwordInputLayout.error = validate.validatePassword(binding.passwordEditRegister)
        phoneInputLayout.error = validate.validatePhone(binding.phoneEditRegister)

        if (usernameInputLayout.error == null &&
            emailInputLayout.error == null &&
            passwordInputLayout.error == null &&
            phoneInputLayout.error == null
        ) {
            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("Name", binding.userEditRegister.text.toString())
            intent.putExtra("Email", binding.emailEditRegister.text.toString())
            intent.putExtra("Phone", binding.phoneEditRegister.text.toString())
            startActivity(intent)
            finish()
        }
    }
}