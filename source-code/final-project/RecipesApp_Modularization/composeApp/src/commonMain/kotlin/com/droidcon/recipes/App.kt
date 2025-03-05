package com.droidcon.recipes

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.droidcon.navigation.RootNavigationGraph
import com.droidcon.recipes.ui.darkScheme
import com.droidcon.recipes.ui.lightScheme
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinContext

@Composable
@Preview
fun App() {
    var darkTheme by remember { mutableStateOf(false) }
    val colorSchema = if (darkTheme) darkScheme else lightScheme
    MaterialTheme(
        colorScheme = colorSchema
    ) {
        KoinContext {
            RootNavigationGraph(
                darkTheme = darkTheme,
                onThemeChange = { darkTheme = it }
            )
        }
    }
}