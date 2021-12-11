package com.example.hotelsapp.adapters

import androidx.recyclerview.widget.RecyclerView
import com.example.hotelsapp.data.Hotel
import com.example.hotelsapp.databinding.ItemHotelsBinding

class HotelsViewAdapter(private val binding: ItemHotelsBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(hotel: Hotel) = with(binding) {
        imageHotel.setImageResource(hotel.imageView)
        nameCityText.text = hotel.nameCity
        availableHotelsText.text = hotel.availableHotel
        ratingHotels.text = hotel.ratingHotel

        root.setOnClickListener{}
    }
}