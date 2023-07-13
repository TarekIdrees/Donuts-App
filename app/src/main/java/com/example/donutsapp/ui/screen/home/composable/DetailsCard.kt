package com.example.donutsapp.ui.screen.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.donutsapp.R
import com.example.donutsapp.ui.composable.CustomButton
import com.example.donutsapp.ui.composable.SpaceHorizontal5
import com.example.donutsapp.ui.composable.SpaceVertical8
import com.example.donutsapp.ui.screen.details.navigateToDetails
import com.example.donutsapp.ui.screen.home.DonutOffer
import com.example.donutsapp.ui.theme.Black60
import com.example.donutsapp.ui.theme.cardBlue
import com.example.donutsapp.ui.theme.Inter
import com.example.donutsapp.ui.theme.Primary
import com.example.donutsapp.ui.theme.Typography
import com.example.donutsapp.ui.theme.cardPink

@Composable
fun DetailsCard(
    navController: NavController,
    donut: DonutOffer
) {
    val colors: List<Color> = listOf(cardPink, cardBlue)
    Box(
        modifier = Modifier.padding(end = 47.dp)
    ) {
        Column(
            modifier = Modifier
                .size(width = 193.dp, height = 325.dp)
                .graphicsLayer(
                    shadowElevation = 30f,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 20.dp,
                        bottomEnd = 20.dp
                    ),
                    translationY = 10f,
                )
                .background(color = colors.random(), shape = RoundedCornerShape(20.dp))
                .clickable { navController.navigateToDetails() },
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            CustomButton(
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp),
                icon = R.drawable.icon_favirote,
                shape = CircleShape,
                iconColor = Primary
            )
            Column(
                modifier = Modifier
                    .padding(start = 20.dp, end = 16.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = donut.name,
                    style = Typography.titleSmall,
                    color = Color.Black
                )
                SpaceVertical8()
                Text(
                    text = donut.description,
                    style = Typography.labelSmall,
                    color = Black60
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 15.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        text = "\$${donut.oldPrice}",
                        color = Black60,
                        style = TextStyle(
                            fontFamily = Inter,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 14.sp
                        ),
                        textDecoration = TextDecoration.LineThrough
                    )
                    SpaceHorizontal5()
                    Text(
                        text = "\$${donut.price}",
                        color = Color.Black,
                        style = TextStyle(
                            fontFamily = Inter,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 22.sp
                        ),
                    )
                }
            }
        }
        Image(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .offset(y = (-40).dp, x = 60.dp)
                .size(width = 200.dp, height = 200.dp),
            painter = painterResource(id = donut.image),
            contentDescription = "donut image",
            contentScale = ContentScale.Fit
        )
    }
}

//@Preview
//@Composable
//fun PreviewDetailsCard() {
//    DetailsCard(DonutOffer())
//}