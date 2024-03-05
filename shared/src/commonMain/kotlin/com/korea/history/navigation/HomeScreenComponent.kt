package com.korea.history.navigation

import com.arkivanov.decompose.ComponentContext

class HomeScreenComponent(
    componentContext: ComponentContext,
    private val onGoBack: () -> Unit,
) : ComponentContext by componentContext {
    fun goBack() {
        onGoBack()
    }
}
