package com.droidcon.demo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.droidcon.demo.presentation.screen.home.HomeScreen
import com.droidcon.demo.presentation.screen.question.QuestionScreen
import com.droidcon.demo.presentation.screen.result.ResultScreen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home
    ) {
        composable<Screen.Home> {
            HomeScreen(
                onStartQuiz = {
                    navController.navigate(Screen.Question)
                }
            )
        }
        composable<Screen.Question> {
            QuestionScreen(
                onAnswerSelected = {
                    navController.navigate(Screen.Result(it))
                }
            )
        }
        composable<Screen.Result> {
            val answer = it.toRoute<Screen.Result>().answer
            ResultScreen(answer = answer,
                onRestart = {
                    navController.navigate(Screen.Home) {
                        popUpTo(0) { inclusive = true }
                    }
                }
            )
        }
    }
}
