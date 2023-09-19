package com.example.shoppinglist.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.domain.model.ShoppingList
import com.example.core.domain.repository.ShoppingListRepository
import com.example.core.domain.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val repository: ShoppingListRepository
) : ViewModel() {
    private var _list: MutableLiveData<MutableList<ShoppingList>> =
        MutableLiveData(mutableListOf())
    val list: LiveData<MutableList<ShoppingList>> = _list

    fun createList(name: String) {
        viewModelScope.launch {
//            _list.postValue(repository.createList(name))
//            _list.value?.add(repository.createList(name))
            val result = repository.createList(name)
            when (result) {
                is Resource.Success -> result.data.let {
                    if (it != null) {
                        _list.value?.add(it)
                    }
                }

                is Resource.Error -> {

                }

                is Resource.Loading -> result.data.let {
                    if (it != null) {
                        _list.value?.add(it)
                    }
                }
            }
        }
    }
}