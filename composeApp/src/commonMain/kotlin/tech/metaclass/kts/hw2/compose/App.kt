package tech.metaclass.kts.hw2.compose

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
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

    NavHost(
        navController = navController,
        startDestination = Start,
        modifier = Modifier
            .fillMaxSize()
            .padding(WindowInsets.safeDrawing.asPaddingValues())
    ) {
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
