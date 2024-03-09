package com.korea.history.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.Children
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.slide
import com.arkivanov.decompose.extensions.compose.jetbrains.stack.animation.stackAnimation
import com.arkivanov.decompose.extensions.compose.jetbrains.subscribeAsState
import com.korea.history.navigation.RootComponent
import com.korea.history.ui.home.HomeScreen

@Composable
fun WussuApp(root: RootComponent) {
    val childStack by root.childStack1.subscribeAsState()

    Children(
        stack = childStack,
        animation = stackAnimation(slide())
    ) { child ->
        when (val instance = child.instance) {
            is RootComponent.Child.MainScreen -> MainScreen(instance.component)
            is RootComponent.Child.HomeScreen -> HomeScreen(instance.component)
        }
    }
}