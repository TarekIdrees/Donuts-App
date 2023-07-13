package com.example.donutsapp.ui.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.donutsapp.ui.composable.SpaceVertical26
import com.example.donutsapp.ui.composable.SpaceVertical47
import com.example.donutsapp.ui.screen.home.composable.DetailsCard
import com.example.donutsapp.ui.screen.home.composable.DonutCard
import com.example.donutsapp.ui.screen.home.composable.Header
import com.example.donutsapp.ui.theme.Typography

@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel(),
) {
    val state by viewModel.state.collectAsState()
    HomeContent(navController = navController, state = state)

}

@Composable
private fun HomeContent(
    navController: NavController,
    state: HomeUiState
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceAround,
        contentPadding = PaddingValues(top = 48.dp, bottom = 107.dp)
    ) {
        item {
            Header()
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 54.dp)
            ) {
                Text(
                    modifier = Modifier.padding(start = 40.dp),
                    text = "Today Offers",
                    style = Typography.labelMedium,
                    color = Color.Black
                )
                SpaceVertical26()
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 40.dp)
                ) {
                    state.donutsOffer.forEachIndexed { index, donutOffer ->
                        item {
                            DetailsCard(navController, index, donutOffer)
                        }
                    }
                }
            }
        }
        item {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 46.dp)
            ) {
                Text(
                    modifier = Modifier.padding(start = 40.dp),
                    text = "Donuts",
                    style = Typography.labelMedium,
                    color = Color.Black
                )
                SpaceVertical47()
                LazyRow(
                    contentPadding = PaddingValues(horizontal = 40.dp)
                ) {
                    state.donuts.forEach {
                        item {
                            DonutCard(navController, it)
                        }
                    }
                }
            }
        }
    }
}

//@Preview
//@Composable
//fun PreviewHome() {
//    HomeScreen()
//}