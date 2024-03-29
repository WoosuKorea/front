package com.korea.history.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import com.korea.history.navigation.MainScreenComponent
import com.korea.history.navigation.MainScreenEvent
import com.korea.history.theme.Wussu_Error
import com.korea.history.theme.displayL

@Composable
fun MainScreen(main: MainScreenComponent) {

    Box(
        modifier = Modifier
            .background(Wussu_Error)
            .fillMaxSize(),
        contentAlignment = Alignment.Center,
    ) {
        Text(
            text = "Main",
            style = displayL(),
            modifier = Modifier.clickable { main.onEvent(MainScreenEvent.ClickImageCard) }
        )
    }
}
