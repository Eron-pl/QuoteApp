package com.psablik.quoteapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.psablik.quoteapp.presentation.favorites.FavoritesView
import com.psablik.quoteapp.presentation.home.HomeView
import com.psablik.quoteapp.presentation.settings.SettingsView
import com.psablik.quoteapp.presentation.splash.SplashView

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation() {
    AnimatedNavHost(
        navController = rememberAnimatedNavController(),
        startDestination = Screen.Home.route,
    ) {
        // Home
        composable(
            route = Screen.Home.route
        ) {
            HomeView()
        }

        // Splash
        composable(
            route = Screen.SplashScreen.route
        ) {
            SplashView()
        }

        // Favorites
        composable(
            route = Screen.Favorites.route
        ) {
            FavoritesView()
        }

        // Settings
        composable(
            route = Screen.Settings.route
        ) {
            SettingsView()
        }
    }
}
