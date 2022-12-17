package com.psablik.quoteapp.presentation.components

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.psablik.quoteapp.navigation.Screen

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    val screenList = listOf(
        Screen.Home,
        Screen.Favorites,
        Screen.Settings
    )

    BottomNavigation() {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route

        screenList.forEach { screen ->
            val selected = screen == Screen.Home
            if (screen.iconId != null && screen.title != null) {
                BottomNavigationItem(
                    selected = selected,
                    onClick = { navController.navigate(screen.route) },
                    icon = {
                        Icon(
                            painter = painterResource(id = screen.iconId!!),
                            contentDescription = "" // TODO : Add description
                        )

                    },
                    label = { Text(text = screen.title!!) }
                )
            }
        }
    }
}