package com.example.donutsapp.ui.screen.details

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.donutsapp.navigation.Screen

private val ROUTE = Screen.DetailsScreen.route
fun NavController.navigateToDetails() {
    navigate(ROUTE)
}

fun NavGraphBuilder.detailsRoute() {
    composable(ROUTE) { DetailsScreen() }
}