package com.bestypie.ktnavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bestypie.ktnavigation.screens.detail.DetailScreen
import com.bestypie.ktnavigation.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
    // Make a controller - nav Controller
    val navController = rememberNavController();

    // Create a nav Host
    NavHost(navController = navController, startDestination = MovieScreen.HomeScreen.name) {

        // Creating Composable
        composable(MovieScreen.HomeScreen.name) {
            HomeScreen(navController = navController);
        }

        composable(MovieScreen.DetailScreen.name) {
            DetailScreen(navController);
        }
    }
}