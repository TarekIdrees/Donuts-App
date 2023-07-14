package com.example.donutsapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.example.donutsapp.LocalNavigationProvider
import com.example.donutsapp.ui.bottom_navigation.bottomNavGraph
import com.example.donutsapp.ui.screen.cover.coverRoute
import com.example.donutsapp.ui.screen.details.detailsRoute
import com.example.donutsapp.ui.screen.home.homeRoute

@Composable
fun DonutsAppNavGraph() {
    val navController = LocalNavigationProvider.current

    NavHost(
        navController = navController,
        startDestination = Screen.CoverScreen.route
    ) {
        bottomNavGraph()
        coverRoute()
        homeRoute()
        detailsRoute()
    }
}

object Graph {
    const val route = "root_graph"
    const val donutScreens = "donut_graph"
    const val home = "home_graph"
}