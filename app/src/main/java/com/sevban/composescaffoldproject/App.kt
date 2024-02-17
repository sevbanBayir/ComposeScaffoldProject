package com.sevban.composescaffoldproject

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.sevban.composescaffoldproject.navigation.NavHost

@Composable
fun App(
    appState: AppState = rememberAppState()
) {

    Scaffold { scaffoldPadding ->
        NavHost(
            appState = appState,
            onShowSnackbar = { _, _ ->
                true
            },
            modifier = Modifier.padding(scaffoldPadding)
        )
    }
}