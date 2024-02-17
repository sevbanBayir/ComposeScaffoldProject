package com.sevban.home

import androidx.annotation.VisibleForTesting
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import java.net.URLDecoder
import java.net.URLEncoder


fun NavController.navigateToHome() {
    navigate("home/") {
        launchSingleTop = true
    }
}

fun NavGraphBuilder.homeScreen(
    onBackClick: () -> Unit,
    onItemClick: (String) -> Unit,   // -> keep hoisting...
) {
    composable(
        route = "home"
    ) {
        HomeScreenRoute(
            onListItemClicked = onItemClick
        )
    }
}
