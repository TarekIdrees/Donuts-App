package com.example.donutsapp.ui.screen.home.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.composable.CustomButton
import com.example.donutsapp.ui.theme.Black60
import com.example.donutsapp.ui.theme.Primary
import com.example.donutsapp.ui.theme.Typography
import com.example.donutsapp.ui.theme.White

@Composable
fun Header(){
    Row(
        modifier = Modifier.fillMaxWidth().padding(start = 40.dp, end = 40.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Column {
            Text(
                text = stringResource(R.string.let_s_gonuts),
                style = Typography.titleLarge,
                color = Primary
            )
            Text(
                text = stringResource(R.string.order_sentence),
                style = Typography.bodySmall,
                color = Black60
            )
        }
        CustomButton(icon = R.drawable.icon_search, color = White, iconColor = Primary)
    }
}