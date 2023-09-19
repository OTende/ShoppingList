package com.example.shoppinglist.data.repository

import com.example.core.domain.model.ShoppingList
import com.example.core.domain.repository.ShoppingListRepository
import com.example.core.domain.util.Resource
import com.example.shoppinglist.data.network.ShoppingApi
import javax.inject.Inject

class ShoppingListRepositoryImpl @Inject constructor(private val api: ShoppingApi) : ShoppingListRepository {
    override suspend fun createList(name: String): Resource<ShoppingList> {
        return try {
            Resource.Loading(
                api.createList(name).toShoppingList(name)
            )
        } catch (e: Exception) {
            Resource.Error(e.message, null)
        }
    }

    override suspend fun removeList(id: Int): Boolean {
        return api.removeList(id).success
    }
}