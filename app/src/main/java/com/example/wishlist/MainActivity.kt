package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    private lateinit var items: MutableList<Item>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemsRv = findViewById<RecyclerView>(R.id.itemsRv)
        val button = findViewById<Button>(R.id.submitButton)
        val nameInput = findViewById<TextInputEditText>(R.id.itemNameInput)
        val priceInput = findViewById<TextInputEditText>(R.id.priceInput)
        val websiteInput = findViewById<TextInputEditText>(R.id.itemWebsiteInput)

        val adapter = WishAdapter(items)
        itemsRv.adapter = adapter
        itemsRv.layoutManager = LinearLayoutManager(this)

        button.setOnClickListener {
            val newItem = Item(nameInput.toString(),
                priceInput.toString(), websiteInput.toString())
            items.add(newItem)
            nameInput.text?.clear()
            priceInput.text?.clear()
            websiteInput.text?.clear()
            adapter.notifyDataSetChanged()
        }
    }
}