package com.example.donutsapp.ui.screen.details.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.composable.CustomButton
import com.example.donutsapp.ui.composable.SpaceHorizontal20
import com.example.donutsapp.ui.composable.SpaceHorizontal26
import com.example.donutsapp.ui.composable.SpaceVertical16
import com.example.donutsapp.ui.composable.SpaceVertical20
import com.example.donutsapp.ui.composable.SpaceVertical26
import com.example.donutsapp.ui.composable.SpaceVertical33
import com.example.donutsapp.ui.composable.SpaceVertical47
import com.example.donutsapp.ui.theme.Black60
import com.example.donutsapp.ui.theme.Black80
import com.example.donutsapp.ui.theme.Primary
import com.example.donutsapp.ui.theme.Typography

@Composable
fun BottomSheet(modifier: Modifier) {
    Box(
        modifier = modifier
            .aspectRatio(4f / 6f)
            .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
            .background(
                Color.White,
                shape = RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)
            )
    ) {
        BottomSheetContain()
    }
}

@Composable
private fun BottomSheetContain() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 35.dp, start = 40.dp)
    ) {
        Text(text = "Strawberry Wheel", style = Typography.titleLarge, color = Primary)
        SpaceVertical33()
        Text(
            text = stringResource(R.string.about_gonut),
            style = Typography.titleMedium,
            color = Black80
        )
        SpaceVertical16()
        Text(
            text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            style = Typography.bodySmall,
            color = Black60
        )
        SpaceVertical26()
        Text(
            text = stringResource(R.string.quantity),
            style = Typography.titleMedium,
            color = Black80
        )
        SpaceVertical20()
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
        ) {
            CustomButton(
                modifier = Modifier.graphicsLayer(
                    shadowElevation = 30f,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 20.dp,
                        bottomEnd = 20.dp
                    ),
                    translationY = 10f,
                ),
                icon = R.drawable.icon_minus
            )
            SpaceHorizontal20()
            Card(
                modifier = Modifier
                    .size(45.dp)
                    .graphicsLayer(
                        shadowElevation = 30f,
                        shape = RoundedCornerShape(
                            topStart = 20.dp,
                            topEnd = 20.dp,
                            bottomStart = 20.dp,
                            bottomEnd = 20.dp
                        ),
                        translationY = 10f,
                    ),
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(15.dp)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "1", style = Typography.displaySmall, color = Color.Black)
                }
            }
            SpaceHorizontal20()
            CustomButton(
                modifier = Modifier.graphicsLayer(
                    shadowElevation = 30f,
                    shape = RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 20.dp,
                        bottomEnd = 20.dp
                    ),
                    translationY = 10f,
                ),
                icon = R.drawable.icon_plus,
                color = Color.Black,
                iconColor = Color.White
            )
        }
        SpaceVertical47()
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("£16", style = Typography.titleLarge, color = Color.Black)
            SpaceHorizontal26()
            Button(
                modifier = Modifier.size(height = 67.dp, width = 268.dp),
                onClick = { },
                colors = ButtonDefaults.buttonColors(Primary)
            ) {
                Text(
                    stringResource(R.string.add_to_cart),
                    style = Typography.labelMedium,
                    color = Color.White
                )
            }
        }

    }

}
