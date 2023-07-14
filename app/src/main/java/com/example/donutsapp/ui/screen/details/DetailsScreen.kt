package com.example.donutsapp.ui.screen.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.donutsapp.R
import com.example.donutsapp.ui.composable.CustomButton
import com.example.donutsapp.ui.screen.details.composable.BodyContent
import com.example.donutsapp.ui.screen.details.composable.BottomSheet
import com.example.donutsapp.ui.theme.Primary
import com.example.donutsapp.ui.theme.White

@Composable
fun DetailsScreen() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .background(White)
        ) {
            val (header, bottomSheet) = createRefs()
            val guideline = createGuidelineFromTop(0.4f)
            BodyContent(Modifier.constrainAs(header) { top.linkTo(parent.top) })
            BottomSheet(Modifier.constrainAs(bottomSheet) { top.linkTo(guideline) })
        }
        CustomButton(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .padding(end = 33.dp)
                .offset(y = (-75).dp),
            icon = R.drawable.icon_favirote,
            iconColor = Primary
        )
    }

}



