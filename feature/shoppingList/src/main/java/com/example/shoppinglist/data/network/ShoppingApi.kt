package com.example.shoppinglist.data.network

import com.example.shoppinglist.domain.model.ListDeletionResponse
import com.example.shoppinglist.domain.model.ListResponse
import retrofit2.http.POST
import retrofit2.http.Query

interface ShoppingApi {
    @POST("CreateShoppingList?")
    suspend fun createList(@Query("name") name: String): ListResponse

    @POST("RemoveShoppingList?")
    suspend fun removeList(@Query("list_id") id: Int): ListDeletionResponse
}