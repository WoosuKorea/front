package com.korea.history.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value

class MainScreenComponent(
    componentContext: ComponentContext,
    private val onNavigateToHome: () -> Unit,
) : ComponentContext by componentContext {
    private var _imageList = MutableValue(emptyList<ByteArray>())
    val imageList: Value<List<ByteArray>> = _imageList

    private var _index = MutableValue(-1)
    val index: Value<Int> = _index

    fun onEvent(event: MainScreenEvent) {
        when (event) {
            is MainScreenEvent.ClickImageCard -> {
                onNavigateToHome()
            }
        }
    }
}

sealed interface MainScreenEvent {
    data object ClickImageCard : MainScreenEvent
}
