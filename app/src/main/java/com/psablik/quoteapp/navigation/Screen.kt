package com.psablik.quoteapp.navigation

sealed class Screen(val route: String) {
    object SplashScreen : Screen("route_splash_screen")
    object Home : Screen("route_home")
    object Favorites : Screen("route_favorites")
    object Settings : Screen("route_settings")
}
