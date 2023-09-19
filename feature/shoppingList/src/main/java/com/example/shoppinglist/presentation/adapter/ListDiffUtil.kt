package com.example.shoppinglist.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.core.domain.model.ShoppingList

class ListDiffUtil : DiffUtil.ItemCallback<ShoppingList>() {
    override fun areItemsTheSame(oldItem: ShoppingList, newItem: ShoppingList): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShoppingList, newItem: ShoppingList): Boolean {
        return oldItem.name == newItem.name
    }
}