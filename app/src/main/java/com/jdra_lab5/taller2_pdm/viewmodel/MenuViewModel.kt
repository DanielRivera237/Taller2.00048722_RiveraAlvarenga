package com.jdra_lab5.taller2_pdm.viewmodel

import androidx.lifecycle.ViewModel
import com.jdra_lab5.taller2_pdm.data.DummyData
import com.jdra_lab5.taller2_pdm.model.Dish
import com.jdra_lab5.taller2_pdm.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MenuViewModel(private val restaurantName: String) : ViewModel() {

    private val _restaurant = DummyData.restaurants.find {
        it.name.equals(restaurantName, ignoreCase = true)
    }

    private val _search = MutableStateFlow("")
    private val _filteredMenu = MutableStateFlow<List<Dish>>(emptyList())

    val search: StateFlow<String> = _search.asStateFlow()
    val filteredMenu: StateFlow<List<Dish>> = _filteredMenu.asStateFlow()
    val restaurant: Restaurant? get() = _restaurant

    init {
        updateFilter()
    }

    fun onSearchChange(newText: String) {
        _search.value = newText
        updateFilter()
    }

    private fun updateFilter() {
        val query = _search.value
        _filteredMenu.value = _restaurant?.menu?.filter {
            it.name.contains(query, ignoreCase = true)
        } ?: emptyList()
    }
}
