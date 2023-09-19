package com.example.core.domain.model

data class ShoppingList(
    val id: Int,
    val name: String,
    val list: MutableList<ShoppingItem> = mutableListOf()
)