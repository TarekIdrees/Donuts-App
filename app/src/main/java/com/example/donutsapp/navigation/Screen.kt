package com.example.donutsapp.navigation

sealed class Screen(val route: String) {
    object CoverScreen : Screen("coverScreen")
    object HomeScreen : Screen("homeScreen")
    object DetailsScreen : Screen("detailsScreen")
}
