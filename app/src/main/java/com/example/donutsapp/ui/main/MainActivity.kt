package com.example.donutsapp.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.donutsapp.ui.theme.DonutsAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DonutsAppTheme {
                val systemUiController = rememberSystemUiController()
                systemUiController.isSystemBarsVisible = false
                MainScreen()
            }
        }
    }
}
