package com.example.donutsapp.ui.screen.cover

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.donutsapp.R
import com.example.donutsapp.ui.composable.SpaceVertical20
import com.example.donutsapp.ui.screen.home.navigateToHome
import com.example.donutsapp.ui.theme.Primary
import com.example.donutsapp.ui.theme.Secondary
import com.example.donutsapp.ui.theme.Typography
import com.example.donutsapp.ui.theme.White

@Composable
fun CoverScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White)
    ) {
        Image(
            painter = painterResource(id = R.drawable.donuts),
            contentDescription = "donuts image"
        )
        Column(
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(start = 40.dp, end = 40.dp, bottom = 40.dp),
        ) {
            Text(
                text = "Gonuts \nwith \nDonuts",
                color = Primary,
                style = Typography.displayLarge,
                textAlign = TextAlign.Start
            )
            SpaceVertical20()
            Text(
                text = stringResource(R.string.cover_description),
                style = Typography.titleMedium,
                color = Secondary
            )
            SpaceVertical20()
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                onClick = { navController.navigateToHome() },
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {
                Text(
                    stringResource(R.string.get_started),
                    style = Typography.labelMedium,
                    color = Color.Black
                )
            }
        }
    }
}

@Preview
@Composable
fun Preview() {
    CoverScreen(navController = rememberNavController())
}