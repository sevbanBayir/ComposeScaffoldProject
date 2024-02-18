package com.sevban.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.sevban.model.Character

@Composable
fun HomeScreenRoute(
    viewModel: HomeViewModel = hiltViewModel(),
    onListItemClicked: (String) -> Unit     //-> hoist navigation actions to appState's navController.
) {
    val homeUiState by viewModel.uiState.collectAsStateWithLifecycle()
    val character by viewModel.characterState.collectAsStateWithLifecycle()
    HomeScreen(homeUiState = homeUiState, onListItemClicked = onListItemClicked, character = character)
}

@Composable
fun HomeScreen(
    homeUiState: UiState,
    character: Character? = null,
    onListItemClicked: (String) -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Home Feature Screen")
        Button(onClick = { onListItemClicked("5") }) {
            Text(text = "Navigate to Detail")
        }
        Text(text = character?.name ?: "Empty")
    }
}