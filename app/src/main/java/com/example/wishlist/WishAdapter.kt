package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishAdapter(private val items: List<Item>) : RecyclerView.Adapter<WishAdapter.ViewHolder>() {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val nameTextView: TextView
        val priceTextView: TextView
        val websiteTextView: TextView
        init {
            nameTextView = itemView.findViewById(R.id.itemNameTv)
            priceTextView = itemView.findViewById(R.id.priceTv)
            websiteTextView = itemView.findViewById(R.id.websiteTv)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.item_layout, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.nameTextView.text = item.itemName
        holder.priceTextView.text = item.itemPrice
        holder.websiteTextView.text = item.website
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

