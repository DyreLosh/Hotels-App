package com.example.hotelsapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.hotelsapp.databinding.ActivityLoginBinding
import com.example.hotelsapp.validator.Validator

class LoginActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val email = binding.emailEditLogin
        val password = binding.passwordEditLogin
        val emailInputLayout = binding.emailInputLogin
        val passwordInputLayout = binding.passwordInputLogin
        val validate = Validator(this)

        binding.loginButtonLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
       /* if( email.text.toString().length > 0 && password.text.toString().length > 0) {
             binding.loginButtonLogin.setBackgroundColor(R.color.blue)
            binding.loginButtonLogin.backgroundTintList = resources.getColor(R.color.blue)
        else {
            binding.loginButtonLogin.setBackgroundColor(R.color.black)
        }*/
        binding.loginButtonLogin.setOnClickListener {

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
}