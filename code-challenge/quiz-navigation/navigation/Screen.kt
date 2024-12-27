package com.droidcon.demo.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen {
    @Serializable
    data object Home : Screen()
    @Serializable
    data object Question : Screen()
    @Serializable
    data class Result(val answer: Int) : Screen()
}