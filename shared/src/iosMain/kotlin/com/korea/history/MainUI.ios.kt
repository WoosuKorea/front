package com.korea.history

import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.korea.history.navigation.RootComponent
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import androidx.compose.runtime.remember
import com.korea.history.ui.WussuApp

fun MainUIViewController() = ComposeUIViewController {
    val root = remember {
        RootComponent(DefaultComponentContext(LifecycleRegistry()))
    }
    WussuApp(root)
}
