package com.example.donutsapp.ui.bottom_navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.donutsapp.navigation.Graph
import com.example.donutsapp.ui.screen.home.HomeScreen


fun NavGraphBuilder.bottomNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.route,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route){
            HomeScreen(navController)
        }
        composable(route = BottomBarScreen.Favorite.route){
            // Not implemented yet
        }
        composable(route = BottomBarScreen.Notification.route){
            // Not implemented yet
        }
        composable(route = BottomBarScreen.Shop.route){
            // Not implemented yet
        }
        composable(route = BottomBarScreen.Profile.route){
            // Not implemented yetHomeScreen()
        }
    }
}