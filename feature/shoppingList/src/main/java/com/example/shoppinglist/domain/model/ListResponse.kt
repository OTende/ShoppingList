package com.example.shoppinglist.domain.model

import com.example.core.domain.model.ShoppingList

data class ListResponse(
    val success: Boolean,
    val id: Int
) {
    fun toShoppingList(name: String): ShoppingList {
        return ShoppingList(id, name)
    }
}