package com.psablik.quoteapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.psablik.quoteapp.R
import com.psablik.quoteapp.presentation.favorites.FavoritesView
import com.psablik.quoteapp.presentation.home.HomeView
import com.psablik.quoteapp.presentation.settings.SettingsView
import com.psablik.quoteapp.presentation.splash.SplashView

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Navigation(
    modifier: Modifier,
    navController: NavHostController
) {

    Screen.Home.apply {
        title = stringResource(id = R.string.screen_home_title)
        iconId = R.drawable.ic_home
    }

    Screen.Favorites.apply {
        title = stringResource(id = R.string.screen_favorites_title)
        iconId = R.drawable.ic_favorite
    }

    Screen.Settings.apply {
        title = stringResource(id = R.string.screen_settings_title)
        iconId = R.drawable.ic_settings
    }

    AnimatedNavHost(
        navController = navController,
        startDestination = Screen.Home.route,
        modifier = modifier
    ) {
        // Home
        composable(
            route = Screen.Home.route
        ) {
            HomeView()
        }

        // Splash
        composable(
            route = Screen.Splash.route
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
