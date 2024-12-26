package com.droidcon.demo.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {
    @Serializable
    data object Home: Screen()
    @Serializable
    data class Details(
        val id: Int = 0
    ): Screen()
}
