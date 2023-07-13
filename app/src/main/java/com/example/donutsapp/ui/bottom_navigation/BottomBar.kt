package com.example.donutsapp.ui.bottom_navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.donutsapp.navigation.Screen
import com.example.donutsapp.ui.theme.Primary

@Composable
fun BottomBar(navController: NavHostController) {

    val screens = listOf(
        BottomBarScreen.Home,
        BottomBarScreen.Favorite,
        BottomBarScreen.Notification,
        BottomBarScreen.Shop,
        BottomBarScreen.Profile,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val selectedScreen = currentDestination?.route ?: Screen.HomeScreen.route

    if (selectedScreen != Screen.CoverScreen.route && selectedScreen != Screen.DetailsScreen.route) {
        NavigationBar(
            containerColor = Color.White,
        ) {
            screens.forEach { screen ->
                val selected =
                    currentDestination?.hierarchy?.any { it.route == screen.route } == true
                NavigationBarItem(
                    icon = {
                        Icon(
                            painter =
                            if (selected) painterResource(id = screen.selectedIcon)
                            else painterResource(id = screen.unSelectedIcon),
                            contentDescription = "Navigation icon"
                        )
                    },
                    selected = selected,
                    onClick = {
                        navController.navigate(screen.route)
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Primary,
                        indicatorColor = Color.White,
                        unselectedIconColor = Primary
                    )
                )
            }
        }
    }

}