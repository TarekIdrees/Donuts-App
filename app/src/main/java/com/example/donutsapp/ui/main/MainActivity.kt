package com.example.donutsapp.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.ui.screen.cover.CoverScreen
import com.example.donutsapp.ui.theme.DonutsAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DonutsAppTheme {
                val navController = rememberNavController()
                CoverScreen(navController)
            }
        }
    }
}
