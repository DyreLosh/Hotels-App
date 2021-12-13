package com.example.hotelsapp.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.example.hotelsapp.databinding.FragmentHomeBinding
import com.example.hotelsapp.fragments.HomeFragment

class HotelSelectNightDialog(context: FragmentHomeBinding) : DialogFragment() {

    val act = context
    private val nights = arrayOf(
        "1 ночь",
        "2 ночи",
        "3 ночи",
        "4 ночи",
        "5 ночей",
        "6 ночей",
        "Неделя",
        "2 недели",
        "3 недели",
        "Месяц")

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

            return activity?.let {
                val builder = AlertDialog.Builder(it)
                builder.setTitle("Выберите количество ночей")
                    .setItems(nights
                    ) { _, which ->
                        act.selectNightNumber.text = nights[which]
                    }
                return builder.create()
            } ?: throw IllegalStateException("Activity cannot be null")
        }
}

