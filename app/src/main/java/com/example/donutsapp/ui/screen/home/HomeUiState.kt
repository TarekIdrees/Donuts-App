package com.example.donutsapp.ui.screen.home

data class HomeUiState(
    val donutsOffer: List<DonutOffer> = emptyList(),
    val donuts: List<Donut> = emptyList()
)

data class DonutOffer(
    val name: String = "",
    val image: Int = 0,
    val description: String = "",
    val price: String = "",
    val oldPrice: String = ""
)

data class Donut(
    val name: String = "",
    val price: String = "",
    val image: Int = 0
)
