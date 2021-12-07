package com.example.hotelsapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hotelsapp.R
import com.example.hotelsapp.adapters.HotelNumbersAdapter
import com.example.hotelsapp.adapters.HotelsAdapter
import com.example.hotelsapp.data.Hotel
import com.example.hotelsapp.data.HotelNumber
import com.example.hotelsapp.databinding.FragmentLikedBinding

class LikedFragment : Fragment() {
    lateinit var binding: FragmentLikedBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLikedBinding.inflate(inflater, container, false)
        val hotelNumber = listOf(
            HotelNumber(
                imageHotelNumber = R.drawable.hotel_card_image,
                nameNumber = "Меркурий",
                ratingNumber = "4.9(808)",
                addresHotel = "Саранск, Большевитская 45",
                priceNumber = "135$"

            )
        )
        val adapter = HotelNumbersAdapter()
        binding.hotelNumberRecyclerView.adapter = adapter
        adapter.submitList(hotelNumber)

        return binding.root
    }
}