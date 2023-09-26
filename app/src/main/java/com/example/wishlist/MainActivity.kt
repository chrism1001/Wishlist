package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var items: MutableList<Item> = ArrayList(20)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemsRv = findViewById<RecyclerView>(R.id.itemsRv)
        val button = findViewById<Button>(R.id.submitButton)
        val nameInput = findViewById<EditText>(R.id.itemNameInput)
        val priceInput = findViewById<EditText>(R.id.priceInput)
        val websiteInput = findViewById<EditText>(R.id.itemWebsiteInput)

        val adapter = WishAdapter(items)
        itemsRv.adapter = adapter
        itemsRv.layoutManager = LinearLayoutManager(this)

        button.setOnClickListener {
            val newItem = Item(nameInput.text.toString(),
                priceInput.text.toString(), websiteInput.text.toString())
            items.add(newItem)
            nameInput.text?.clear()
            priceInput.text?.clear()
            websiteInput.text?.clear()
            adapter.notifyDataSetChanged()
        }
    }
}