package com.example.donutsapp.ui.screen.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.LocalNavigationProvider
import com.example.donutsapp.ui.screen.details.navigateToDetails
import com.example.donutsapp.ui.screen.home.Donut
import com.example.donutsapp.ui.theme.Black60
import com.example.donutsapp.ui.theme.Inter
import com.example.donutsapp.ui.theme.Primary
import com.example.donutsapp.ui.theme.Typography

@Composable
fun DonutCard(
    donut: Donut
) {
    val navController = LocalNavigationProvider.current
    Box(modifier = Modifier.padding(end = 21.dp)) {
        Column(
            modifier = Modifier
                .size(width = 138.dp, height = 111.dp)
                .graphicsLayer(
                    shadowElevation = 20f,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    ),
                    translationY = 50f,
                )
                .background(
                    color = Color.White,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 10.dp,
                        bottomEnd = 10.dp
                    )
                )
                .clickable { navController.navigateToDetails() },
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = donut.name,
                style = Typography.bodySmall,
                color = Black60
            )
            Text(
                text = "$ ${donut.price}",
                style = TextStyle(
                    fontFamily = Inter,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 14.sp
                ),
                color = Primary
            )
        }
        Image(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .offset(y = (-40).dp)
                .size(width = 100.dp, height = 100.dp),
            painter = painterResource(id = donut.image),
            contentDescription = "donut image",
        )
    }
}

//@Preview
//@Composable
//fun PreviewDonutCard() {
//    DonutCard(Donut())
//}