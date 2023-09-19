package com.example.core.domain.repository

import com.example.core.domain.model.ShoppingList
import com.example.core.domain.util.Resource

interface ShoppingListRepository {
    suspend fun createList(name: String): Resource<ShoppingList>
    suspend fun removeList(id: Int): Boolean
}