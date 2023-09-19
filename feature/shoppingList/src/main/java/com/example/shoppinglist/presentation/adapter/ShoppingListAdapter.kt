package com.example.shoppinglist.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.core.domain.model.ShoppingList
import com.example.shoppinglist.databinding.ListItemBinding

class ShoppingListAdapter : ListAdapter<ShoppingList, ShoppingListAdapter.ListViewHolder>(ListDiffUtil()) {
    class ListViewHolder(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ShoppingList) {
            binding.asd.text = item.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(inflater, parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val item = currentList[position]
        holder.bind(item)
    }
}