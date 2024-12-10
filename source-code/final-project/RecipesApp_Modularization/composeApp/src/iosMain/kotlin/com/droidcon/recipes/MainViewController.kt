package com.droidcon.recipes

import androidx.compose.ui.window.ComposeUIViewController
import com.droidcon.recipes.di.initializeKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initializeKoin() }
) { App() }