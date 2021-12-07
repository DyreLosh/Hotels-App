package com.example.hotelsapp.fragments

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import com.example.hotelsapp.R
import com.example.hotelsapp.adapters.HotelsAdapter
import com.example.hotelsapp.data.Hotel
import com.example.hotelsapp.databinding.FragmentHomeBinding
import java.util.*


class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

      /*  val calendar = Calendar.getInstance()
        val year = calendar.get(Calendar.YEAR)
        val month = calendar.get(Calendar.MONTH)
        val day = calendar.get(Calendar.DAY_OF_MONTH)

        binding.calendarButton.setOnClickListener {
            val click = DatePickerDialog(this, DatePickerDialog.OnDateSetListener{view, mYear, mMonth, mDay ->
                binding.calendarButton.setText(""+ mDay +"/"+ mMonth +"/"+ mYear)
            }, year, month, day)
            click.show()
        }*/
        val hotels = listOf(
            Hotel(
                imageView = R.drawable.hotel_one_image,
                nameCity = "Хилтон",
                availableHotel ="Доступно 12 номеров" ,
                ratingHotel = "4.8"
            ),
            Hotel(
                imageView = R.drawable.hotel_two_image,
                nameCity = "Меркурий",
                availableHotel ="5 свободных номеров" ,
                ratingHotel = "4.9"
            ),
            Hotel(
                imageView = R.drawable.hotel_three_image,
                nameCity = "Аура",
                availableHotel ="12 свободных номеров" ,
                ratingHotel = "4.9"
            ),
            Hotel(
                imageView = R.drawable.hotel_four_image,
                nameCity = "Ambassador",
                availableHotel ="12 свободных номеров" ,
                ratingHotel = "4.9"
            ),
            Hotel(
                imageView = R.drawable.hotel_five_image,
                nameCity = "Звездная",
                availableHotel ="12 свободных номеров" ,
                ratingHotel = "4.9"
            )
        )
        val adapter = HotelsAdapter()
        binding.recyclerHotels.adapter = adapter
        adapter.submitList(hotels)
        return binding.root
    }
}