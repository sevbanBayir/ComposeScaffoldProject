package com.sevban.home

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun HomeScreenRoute(
    viewModel: HomeViewModel = hiltViewModel(),
//  onListItemClicked: () -> Unit     -> hoist navigation actions to appState's navController.
) {
    val homeUiState by viewModel.uiState.collectAsStateWithLifecycle()

    HomeScreen(homeUiState = homeUiState)
}

@Composable
fun HomeScreen(
    homeUiState: UiState
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("Home Feature Screen")
    }
}