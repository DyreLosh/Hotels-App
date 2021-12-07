package com.example.hotelsapp.adapters

import androidx.recyclerview.widget.RecyclerView
import com.example.hotelsapp.data.HotelNumber
import com.example.hotelsapp.databinding.ItemHotelLikedCardBinding

class HotelNumbersViewAdapter(private val binding: ItemHotelLikedCardBinding) : RecyclerView.ViewHolder(binding.root) {
    
    fun bind(hotelNumber: HotelNumber) = with(binding) {
        hotelNumberImage.setImageResource(hotelNumber.imageHotelNumber)
        nameNumber.text = hotelNumber.nameNumber
        ratingNumber.text = hotelNumber.ratingNumber
        addresHotel.text = hotelNumber.addresHotel
        priceNumber.text = hotelNumber.priceNumber
    }
}