package com.example.hotelsapp.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hotelsapp.data.Hotel
import com.example.hotelsapp.databinding.ItemHotelsBinding

class HotelsAdapter : RecyclerView.Adapter<HotelsViewAdapter>() {

    val items = mutableListOf<Hotel>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelsViewAdapter {
        return HotelsViewAdapter(ItemHotelsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: HotelsViewAdapter, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size
}