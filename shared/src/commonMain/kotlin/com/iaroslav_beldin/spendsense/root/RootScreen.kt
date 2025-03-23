package com.iaroslav_beldin.spendsense.root

import androidx.compose.runtime.Composable
import com.iaroslav_beldin.spendsense.settings.compose.SettingsScreen
import com.iaroslav_beldin.spendsense.settings.SettingsViewModel

@Composable
fun RootScreen() {
    SettingsScreen(SettingsViewModel())
}