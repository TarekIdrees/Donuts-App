package com.example.donutsapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.donutsapp.ui.screen.cover.coverRoute
import com.example.donutsapp.ui.screen.details.detailsRoute
import com.example.donutsapp.ui.screen.home.homeRoute

@Composable
fun DonutsAppNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.CoverScreen.route
    ) {
        coverRoute(navController)
        homeRoute(navController)
        detailsRoute(navController)
    }
}