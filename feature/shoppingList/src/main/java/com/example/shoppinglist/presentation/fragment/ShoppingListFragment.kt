package com.example.shoppinglist.presentation.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.shoppinglist.R
import com.example.shoppinglist.databinding.FragmentShoppingListBinding
import com.example.shoppinglist.presentation.adapter.ShoppingListAdapter
import com.example.shoppinglist.presentation.viewmodel.ListViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoppingListFragment : Fragment() {
    private val viewModel: ListViewModel by viewModels()

    private var _binding: FragmentShoppingListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val adapter = ShoppingListAdapter()
        binding.shoppingList.adapter = adapter

        viewModel.list.observe(viewLifecycleOwner) {
            adapter.submitList(it)
        }

        return inflater.inflate(R.layout.fragment_shopping_list, container, false)
    }
}