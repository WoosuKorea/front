package com.korea.history.ui.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.korea.history.navigation.HomeScreenComponent
import com.korea.history.theme.BackGround

@Composable
fun HomeScreen(home: HomeScreenComponent) {
    Box(
        modifier = Modifier
            .background(BackGround)
            .fillMaxSize(),
    ) {
        BottomRice(Modifier.align(Alignment.BottomCenter))
    }
}

