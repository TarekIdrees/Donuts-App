package com.example.donutsapp.ui.screen.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.donutsapp.navigation.Screen

private val ROUTE = Screen.HomeScreen.route
fun NavController.navigateToHome() {
    navigate(ROUTE)
}

fun NavGraphBuilder.homeRoute() {
    composable(ROUTE) { HomeScreen() }
}