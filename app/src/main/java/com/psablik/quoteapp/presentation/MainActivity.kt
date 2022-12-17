package com.psablik.quoteapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.navigation.animation.rememberAnimatedNavController
import com.psablik.quoteapp.navigation.Navigation
import com.psablik.quoteapp.presentation.components.BottomNavigationBar
import com.psablik.quoteapp.presentation.ui.theme.QuoteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MainScreen() {
    val navController = rememberAnimatedNavController()

    QuoteAppTheme {
        Column(
            Modifier.fillMaxSize()) {
            Navigation(
                modifier = Modifier.weight(1f),
                navController = navController
            )
            BottomNavigationBar(
                navController = navController
            )
        }
    }
}
