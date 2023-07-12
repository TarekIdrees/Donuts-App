package com.example.donutsapp.ui.screen.cover

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.Primary
import com.example.donutsapp.ui.theme.Typography
import com.example.donutsapp.ui.theme.White

@Composable
fun CoverScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = rememberAsyncImagePainter(R.drawable.donuts),
            contentDescription = "cover logo",
            contentScale = ContentScale.Crop
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Text(
                    text = "Gonuts with Donuts",
                    style = Typography.displayLarge,
                    color = Primary,
                    lineHeight = 80.sp,
                    textAlign = TextAlign.Start
                )
            }
            Image(
                modifier = Modifier
                    .size(150.dp),
                painter = painterResource(id = R.drawable.half_donut),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Preview
@Composable
fun Preview() {
    CoverScreen(navController = rememberNavController())
}