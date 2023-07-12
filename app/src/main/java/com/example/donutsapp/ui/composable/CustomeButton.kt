package com.example.donutsapp.ui.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    size: Dp = 45.dp,
    onClick: () -> Unit = {},
    RoundValue: Dp = 15.dp,
    shape: RoundedCornerShape = RoundedCornerShape(RoundValue),
    color: Color = Color.White,
    elevation: Dp = 1.dp,
    icon: Int,
    iconColor: Color = Color.Black
) {
    Button(
        modifier = modifier.size(size),
        onClick = onClick,
        shape = shape,
        colors = ButtonDefaults.buttonColors(color),
        elevation = ButtonDefaults.buttonElevation(elevation),
        contentPadding = PaddingValues(0.dp)
    ) {
        Icon(painterResource(id = icon) ,tint = iconColor, contentDescription = "")
    }
}