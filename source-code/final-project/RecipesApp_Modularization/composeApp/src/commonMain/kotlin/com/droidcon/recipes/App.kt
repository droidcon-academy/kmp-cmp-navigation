package com.droidcon.recipes

import androidx.compose.material3.DrawerValue
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import com.droidcon.navigation.RootNavigationGraph
import com.droidcon.recipes.presentation.screen.root.RootScreen
import com.droidcon.recipes.ui.darkScheme
import com.droidcon.recipes.ui.lightScheme
import kotlinx.coroutines.launch
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
            val scope = rememberCoroutineScope()
            val drawerState = rememberDrawerState(DrawerValue.Closed)
            RootNavigationGraph(
                darkTheme = darkTheme,
                onThemeChange = { darkTheme = it },
                root = { navigateToSettings ->
                    RootScreen(
                        drawerState = drawerState,
                        navigateToSettings = {
                            navigateToSettings()
                            scope.launch {
                                drawerState.close()
                            }
                        }
                    )
                }
            )
        }
    }
}