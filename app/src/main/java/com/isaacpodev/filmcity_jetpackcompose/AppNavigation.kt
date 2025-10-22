package com.isaacpodev.filmcity_jetpackcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.isaacpodev.filmcity_jetpackcompose.loginpage.ui.LoginScreen
import com.isaacpodev.filmcity_jetpackcompose.mainscreen.MainScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(navController = navController)
        }
        composable("main") {
            MainScreen()
        }
    }
}