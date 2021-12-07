package com.example.hotelsapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelsapp.data.HotelNumber
import com.example.hotelsapp.databinding.ItemHotelLikedCardBinding

class HotelNumbersAdapter : RecyclerView.Adapter<HotelNumbersViewAdapter>() {

    val items = mutableListOf<HotelNumber>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelNumbersViewAdapter {
        return HotelNumbersViewAdapter(ItemHotelLikedCardBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: HotelNumbersViewAdapter, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    fun submitList(hotelNumber: List<HotelNumber>) {
        items.clear()
        items.addAll(hotelNumber)
        notifyDataSetChanged()
    }
}