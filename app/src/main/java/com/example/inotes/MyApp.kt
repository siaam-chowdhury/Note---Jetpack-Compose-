package com.example.inotes

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.inotes.navigation.AppBottomNav
import com.example.inotes.navigation.Routes
import com.example.inotes.screens.CategoryScreen
import com.example.inotes.screens.HomeScreen
import com.example.inotes.screens.SettingScreen


@Composable
fun MyApp() {

    val navController = rememberNavController()
    Scaffold(bottomBar = { AppBottomNav(navController)}) {
        NavHost(
            navController = navController,
            startDestination = Routes.Home.route,
        ) {

            // Home Screen
            composable(Routes.Home.route) {
                HomeScreen(navController)
            }

            // Category Screen
            composable(Routes.Category.route) {
                CategoryScreen(navController)
            }

            // Setting Screen
            composable(Routes.Setting.route) {
                SettingScreen(navController)
            }
        }
    }

}
