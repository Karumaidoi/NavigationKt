package com.bestypie.ktnavigation.navigation

enum class MovieScreen {
    HomeScreen,
    DetailScreen,;

    companion object {
        fun fromRoute(route: String?) :MovieScreen
        = when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailScreen.name -> DetailScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("No Route Found")
        }
    }
}