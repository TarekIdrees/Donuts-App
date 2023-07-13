package com.example.donutsapp.ui.bottom_navigation

import com.example.donutsapp.R

sealed class BottomBarScreen(
    val route: String,
    val selectedIcon: Int,
    val unSelectedIcon: Int
) {
    object Home : BottomBarScreen(
        route = "home",
        selectedIcon = R.drawable.icon_filled_home,
        unSelectedIcon = R.drawable.icon_outline_home
    )

    object Favorite : BottomBarScreen(
        route = "favorite",
        selectedIcon = R.drawable.icon_filled_favorite,
        unSelectedIcon = R.drawable.icon_outline_favorite
    )

    object Notification : BottomBarScreen(
        route = "notification",
        selectedIcon = R.drawable.icon_filled_notification,
        unSelectedIcon = R.drawable.icon_outline_notification
    )

    object Shop : BottomBarScreen(
        route = "shop",
        selectedIcon = R.drawable.icon_filled_shop,
        unSelectedIcon = R.drawable.icon_outline_shop
    )

    object Profile : BottomBarScreen(
        route = "profile",
        selectedIcon = R.drawable.icon_filled_profile,
        unSelectedIcon = R.drawable.icon_outline_profile
    )
}
