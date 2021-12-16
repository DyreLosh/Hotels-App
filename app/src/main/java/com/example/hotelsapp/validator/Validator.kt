package com.example.hotelsapp.validator

import android.content.Context
import android.widget.EditText
import com.example.hotelsapp.R

class Validator(private val context: Context) {

    fun validateName(name: EditText): String? =
        when {
            name.text.toString().isBlank() -> context.getString(R.string.error_empty)
            name.length() <= ValidatorConst.USERNAME_LENGTH -> context.getString(R.string.error_username_more4)
            else -> null
        }

    fun validateEmail(email: EditText): String? =
        when {
            email.text.toString().isBlank() -> context.getString(R.string.error_empty)
            email.length() <= ValidatorConst.EMAIL_LENGTH -> context.getString(R.string.error_email_more8)
            !(email.text.toString().contains(ValidatorConst.EMAIL_TRUE)) -> context.getString(R.string.error_email_true)
            else -> null
        }

    fun validatePassword(password: EditText): String? =
        when {
            password.text.toString().isBlank() -> context.getString(R.string.error_empty)
            password.length() <= ValidatorConst.PASSWORD_LENGTH -> context.getString(R.string.error_email_more8)
            else -> null
        }

    fun validatePhone(phoneNumber: EditText): String? =
        when {
            phoneNumber.text.toString().isBlank() -> context.getString(R.string.error_empty)
            phoneNumber.length() < ValidatorConst.PHONE_LENGTH -> context.getString(R.string.error_password_empty)
            else -> null
        }
}