package com.example.hotelsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotelsapp.DatePickerDialog
import com.example.hotelsapp.R
import com.example.hotelsapp.adapters.HotelsAdapter
import com.example.hotelsapp.data.Hotel
import com.example.hotelsapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.apply {
            binding.calendarButton.setOnClickListener {

                val datePickerFragment = DatePickerDialog()
                val supportFragmentManager = requireActivity().supportFragmentManager

                supportFragmentManager.setFragmentResultListener(
                    "REQUEST_KEY",
                    viewLifecycleOwner
                ) { resultKey, bundle ->
                    if (resultKey == "REQUEST_KEY") {
                        val date = bundle.getString("SELECTED_DATE")
                        binding.calendarButton.text = date
                    }
                }

                datePickerFragment.show(supportFragmentManager, "DatePickerFragment")
            }

            val hotels = listOf(
                Hotel(
                    imageView = R.drawable.hotel_one_image,
                    nameCity = "Хилтон",
                    availableHotel = "Доступно 12 номеров",
                    ratingHotel = "4.8"
                ),
                Hotel(
                    imageView = R.drawable.hotel_two_image,
                    nameCity = "Меркурий",
                    availableHotel = "Доступно 5 номеров",
                    ratingHotel = "4.9"
                ),
                Hotel(
                    imageView = R.drawable.hotel_three_image,
                    nameCity = "Аура",
                    availableHotel = "Доступно 7 номеров",
                    ratingHotel = "4.9"
                ),
                Hotel(
                    imageView = R.drawable.hotel_four_image,
                    nameCity = "Ambassador",
                    availableHotel = "Доступно 12 номеров",
                    ratingHotel = "4.9"
                ),
                Hotel(
                    imageView = R.drawable.hotel_five_image,
                    nameCity = "Звездная",
                    availableHotel = "Доступно 9 номеров",
                    ratingHotel = "4.9"
                )
            )
            val adapter = HotelsAdapter()
            binding.recyclerHotels.adapter = adapter
            adapter.submitList(hotels)
            return binding.root
        }
    }
}