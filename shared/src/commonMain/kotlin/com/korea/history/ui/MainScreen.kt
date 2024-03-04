package com.korea.history.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.korea.history.theme.Wussu_Error
import com.korea.history.theme.displayL

@Composable
fun MainScreen() {
    Box(
        modifier = Modifier
            .background(Wussu_Error)
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "fadfad",
            style = displayL()
        )
    }
}
