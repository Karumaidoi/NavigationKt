package com.bestypie.ktnavigation.screens.home

import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.bestypie.ktnavigation.navigation.MovieScreen

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(modifier = Modifier, backgroundColor = Color.Magenta) {
                Text(text = "Movies")
            }
        }
    ) {
       Button(onClick = {
           navController.navigate(MovieScreen.DetailScreen.name)
       }) {
           Text(text = "Go To Detail Screen")
       }
    }
}