package com.korea.history.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.korea.history.navigation.HomeScreenComponent
import com.korea.history.theme.Wussu_Black
import com.korea.history.theme.Wussu_White
import com.korea.history.theme.displayL

@Composable
fun HomeScreen(home: HomeScreenComponent) {
    Box(
        modifier = Modifier
            .background(Wussu_Black)
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Home",
            style = displayL(),
            color = Wussu_White,
            modifier = Modifier.clickable { home.goBack() }
        )
    }
}
