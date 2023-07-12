package com.example.donutsapp.ui.screen.details.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.Primary

@Composable
fun BodyContent(modifier: Modifier) {
    Box(
        modifier = modifier
            .aspectRatio(9f / 7.5f)
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = rememberAsyncImagePainter(R.drawable.details_donut),
            contentScale = ContentScale.Crop,
            contentDescription = "donut logo"
        )
        IconButton(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(16.dp),
            onClick = {  }
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_back),
                contentDescription = "back button",
                tint = Primary
            )
        }
    }
}