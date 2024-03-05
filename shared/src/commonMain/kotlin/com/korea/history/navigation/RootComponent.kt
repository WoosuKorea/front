package com.korea.history.navigation

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.pushNew
import kotlinx.serialization.Serializable

class RootComponent(
    componentContext: ComponentContext,
) : ComponentContext by componentContext {
    private val navigation = StackNavigation<Configuration>()

    val childStack1 = childStack(
        source = navigation,
        serializer = Configuration.serializer(),
        initialConfiguration = Configuration.MainScreen,
        handleBackButton = true,
        childFactory = ::createChild,
    )

    @OptIn(ExperimentalDecomposeApi::class)
    private fun createChild(
        config: Configuration,
        context: ComponentContext,
    ): Child {
        return when (config) {
            Configuration.MainScreen -> {
                Child.MainScreen(
                    MainScreenComponent(
                        componentContext = context,
                        onNavigateToHome = {
                            navigation.pushNew(Configuration.HomeScreen)
                        },
                    ),
                )
            }

            is Configuration.HomeScreen -> {
                Child.HomeScreen(
                    HomeScreenComponent(
                        componentContext = context,
                        onGoBack = {
                            navigation.pop()
                        },
                    ),
                )
            }
        }
    }

    sealed class Child {
        data class MainScreen(val component: MainScreenComponent) : Child()
        data class HomeScreen(val component: HomeScreenComponent) : Child()
    }

    @Serializable
    sealed class Configuration {
        @Serializable
        data object MainScreen : Configuration()

        @Serializable
        data object HomeScreen : Configuration()
    }
}
