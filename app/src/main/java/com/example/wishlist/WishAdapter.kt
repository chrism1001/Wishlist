package com.example.wishlist

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WishAdapter {
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
}

