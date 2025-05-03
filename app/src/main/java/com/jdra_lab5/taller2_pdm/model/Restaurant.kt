package com.jdra_lab5.taller2_pdm.model

data class Restaurant(
    val name: String,
    val description: String,
    val imageUrl: String, // ← antes era imageRes: Int
    val category: String,
    val menu: List<Dish>
)