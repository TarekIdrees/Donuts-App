package com.example.donutsapp.ui.screen.home

import androidx.lifecycle.ViewModel
import com.example.donutsapp.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(HomeUiState())
    val state = _state.asStateFlow()

    init {
        getDonutsOffer()
        getDonuts()
    }

    private fun getDonutsOffer() {
        _state.update {
            it.copy(
                donutsOffer = listOf(
                    DonutOffer(
                        name = "Strawberry Wheel",
                        image = R.drawable.strawberry_wheel_donut,
                        description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                        price = "16",
                        oldPrice = "20"
                    ),
                    DonutOffer(
                        name = "Chocolate Glaze",
                        image = R.drawable.chocolate_glaze_donut,
                        description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                        price = "16",
                        oldPrice = "20"
                    ),
                    DonutOffer(
                        name = "Strawberry Wheel",
                        image = R.drawable.strawberry_wheel_donut,
                        description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                        price = "16",
                        oldPrice = "20"
                    ),
                    DonutOffer(
                        name = "Chocolate Glaze",
                        image = R.drawable.chocolate_glaze_donut,
                        description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                        price = "16",
                        oldPrice = "20"
                    ),
                    DonutOffer(
                        name = "Strawberry Wheel",
                        image = R.drawable.strawberry_wheel_donut,
                        description = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                        price = "16",
                        oldPrice = "20"
                    ),
                    DonutOffer(
                        name = "Chocolate Glaze",
                        image = R.drawable.chocolate_glaze_donut,
                        description = "Moist and fluffy baked chocolate donuts full of chocolate flavor.",
                        price = "16",
                        oldPrice = "20"
                    ),
                )
            )
        }
    }

    private fun getDonuts() {
        _state.update {
            it.copy(
                donuts = listOf(
                    Donut(
                        name = "Chocolate Cherry",
                        price = "22",
                        image = R.drawable.chocolate_cherry_donut
                    ),
                    Donut(
                        name = "Strawberry Rain",
                        price = "22",
                        image = R.drawable.strawberry_rain_donut
                    ),
                    Donut(
                        name = "Strawberry",
                        price = "22",
                        image = R.drawable.strawberry_donut
                    ),
                    Donut(
                        name = "Chocolate Cherry",
                        price = "22",
                        image = R.drawable.chocolate_cherry_donut
                    ),
                    Donut(
                        name = "Strawberry Rain",
                        price = "22",
                        image = R.drawable.strawberry_rain_donut
                    ),
                    Donut(
                        name = "Strawberry",
                        price = "22",
                        image = R.drawable.strawberry_donut
                    ),
                )
            )
        }
    }

}