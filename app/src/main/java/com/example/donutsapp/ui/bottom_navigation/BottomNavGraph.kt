package com.example.donutsapp.ui.bottom_navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.donutsapp.ui.screen.home.HomeScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
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