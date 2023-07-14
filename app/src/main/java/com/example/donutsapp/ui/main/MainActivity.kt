package com.example.donutsapp.ui.main

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.LocalNavigationProvider
import com.example.donutsapp.navigation.DonutsAppNavGraph
import com.example.donutsapp.ui.bottom_navigation.BottomBar
import com.example.donutsapp.ui.theme.DonutsAppTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CompositionLocalProvider(LocalNavigationProvider provides rememberNavController()) {
                DonutsAppTheme {
                    val systemUiController = rememberSystemUiController()
                    systemUiController.isSystemBarsVisible = false
                    Scaffold(
                        bottomBar = {
                            BottomBar()
                        }
                    ) {
                        DonutsAppNavGraph()
                    }
                }
            }
        }
    }
}
