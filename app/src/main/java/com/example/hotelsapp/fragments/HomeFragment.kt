package com.example.hotelsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotelsapp.R
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

        val hotels = listOf(
            Hotel(
                imageView = R.drawable.hotel_one_image,
                nameCity = "DASASDDA",
                availableHotel ="ASDAS ASDAS ASD" ,
                ratingHotel = "5.0"
            )
        )

        return binding.root
    }
}