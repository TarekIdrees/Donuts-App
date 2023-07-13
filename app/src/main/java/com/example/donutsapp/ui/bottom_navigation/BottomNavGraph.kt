package com.example.donutsapp.ui.bottom_navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.donutsapp.navigation.Graph
import com.example.donutsapp.ui.screen.favorite.FavoriteScreen
import com.example.donutsapp.ui.screen.home.HomeScreen
import com.example.donutsapp.ui.screen.notification.NotificationScreen
import com.example.donutsapp.ui.screen.profile.ProfileScreen
import com.example.donutsapp.ui.screen.shop.ShopScreen


fun NavGraphBuilder.bottomNavGraph(navController: NavHostController) {
    navigation(
        route = Graph.route,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route){
            HomeScreen(navController)
        }
        composable(route = BottomBarScreen.Favorite.route){
            FavoriteScreen()
        }
        composable(route = BottomBarScreen.Notification.route){
            NotificationScreen()
        }
        composable(route = BottomBarScreen.Shop.route){
            ShopScreen()
        }
        composable(route = BottomBarScreen.Profile.route){
           ProfileScreen()
        }
    }
}