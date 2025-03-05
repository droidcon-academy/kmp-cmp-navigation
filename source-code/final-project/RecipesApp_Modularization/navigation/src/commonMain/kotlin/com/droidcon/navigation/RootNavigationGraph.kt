package com.droidcon.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.droidcon.settings.SettingsScreen
import com.droidcon.shared.navigation.Screen
import com.droidcon.root.RootScreen

@Composable
fun RootNavigationGraph(
    darkTheme: Boolean,
    onThemeChange: (Boolean) -> Unit,
    root: @Composable (navigateToSettings: () -> Unit) -> Unit
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Root
    ) {
        composable<Screen.Root> {
            root { navController.navigate(Screen.Settings) }
        }
        composable<Screen.Settings> {
            SettingsScreen(
                darkTheme = darkTheme,
                onThemeChange = onThemeChange,
                navigateBack = {
                    navController.navigateUp()
                }
            )
        }
    }
}