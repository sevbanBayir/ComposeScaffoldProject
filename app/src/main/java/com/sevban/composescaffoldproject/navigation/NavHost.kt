package com.sevban.composescaffoldproject.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.sevban.composescaffoldproject.AppState
import com.sevban.detail.detailScreen
import com.sevban.detail.navigateToDetail
import com.sevban.home.homeScreen

/**
 * Top-level navigation graph. Navigation is organized as explained at
 * https://d.android.com/jetpack/compose/nav-adaptive
 *
 * The navigation graph defined in this file defines the different top level routes. Navigation
 * within each route is handled using state and Back Handlers.
 */
@Composable
fun NavHost(
    appState: AppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = Destination.HOME.route,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeScreen(onItemClick = navController::navigateToDetail, onBackClick = navController::popBackStack)
        detailScreen (onBackClick = navController::popBackStack)
    }
}
