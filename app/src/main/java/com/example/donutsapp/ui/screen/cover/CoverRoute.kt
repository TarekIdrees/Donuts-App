package com.example.donutsapp.ui.screen.cover

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.donutsapp.navigation.Screen

private val ROUTE = Screen.CoverScreen.route
fun NavController.navigateToCover() {
    navigate(ROUTE)
}

fun NavGraphBuilder.coverRoute(navController: NavController) {
    composable(ROUTE) { CoverScreen(navController = navController) }
}