package com.iaroslav_beldin.spendsense.root

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.iaroslav_beldin.spendsense.common.ui.AppTheme
import com.iaroslav_beldin.spendsense.common.ui.AppThemeProvider
import com.iaroslav_beldin.spendsense.settings.compose.SettingsScreen
import com.iaroslav_beldin.spendsense.settings.SettingsViewModel

@Composable
fun RootScreen(viewModel: RootViewModel) {
    val state by viewModel.state.collectAsState()
    AppTheme(
        themeIsDark = state.themeIsDark,
        appPrefs = state.appPrefs
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(AppThemeProvider.colors.background)
        ) {
            SettingsScreen(SettingsViewModel())
        }
    }
}