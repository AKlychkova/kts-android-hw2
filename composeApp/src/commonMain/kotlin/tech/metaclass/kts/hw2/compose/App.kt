package tech.metaclass.kts.hw2.compose

import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
object Start

@Serializable
object Login

@Composable
fun App() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Start) {
        composable<Start> {
            StartScreen(
                onButtonClick = {
                    navController.navigate(route = Login)
                }
            )
        }
        composable<Login> {
            LoginScreen(
                onLoginClick = { _, _ -> }
            )
        }
    }
}