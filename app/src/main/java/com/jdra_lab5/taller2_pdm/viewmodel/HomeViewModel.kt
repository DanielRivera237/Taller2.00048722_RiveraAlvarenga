package com.jdra_lab5.taller2_pdm.viewmodel

import androidx.lifecycle.ViewModel
import com.jdra_lab5.taller2_pdm.data.DummyData
import com.jdra_lab5.taller2_pdm.model.Restaurant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class HomeViewModel : ViewModel() {

    private val _groupedRestaurants = MutableStateFlow<Map<String, List<Restaurant>>>(emptyMap())
    val groupedRestaurants: StateFlow<Map<String, List<Restaurant>>> = _groupedRestaurants.asStateFlow()

    init {
        _groupedRestaurants.value = DummyData.restaurants.groupBy { it.category }
    }
}
