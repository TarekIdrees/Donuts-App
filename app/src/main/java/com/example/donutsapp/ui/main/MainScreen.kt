package com.example.donutsapp.ui.main

import android.annotation.SuppressLint
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.navigation.DonutsAppNavGraph

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()
//    Scaffold(
//        bottomBar = {
//            BottomBar(navController = navController)
//        }
//    ) {
//        BottomNavGraph(navController = navController)
//    }
    Scaffold {
        DonutsAppNavGraph(navController = navController)
    }

}

