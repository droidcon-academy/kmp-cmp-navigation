package com.droidcon.demo.navigation

import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.droidcon.demo.presentation.screen.details.DetailsScreen
import com.droidcon.demo.presentation.screen.home.HomeScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home,
        enterTransition = { scaleIn() },
        exitTransition = { scaleOut() },
        popEnterTransition = { scaleIn() },
        popExitTransition = { scaleOut() }
    ) {
        composable<Screen.Home> {
            HomeScreen(
                navigateToDetails = {
                    navController.navigate(Screen.Details(99))
                }
            )
        }
        composable<Screen.Details> {
            val id = it.toRoute<Screen.Details>().id
            DetailsScreen(
                id = id,
                navigateBack = { navController.navigateUp() }
            )
        }
    }
}
