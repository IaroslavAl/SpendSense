package com.iaroslav_beldin.spendsense.settings.compose

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iaroslav_beldin.spendsense.settings.SettingsViewModel

@Composable
fun SettingsScreen(
    viewModel: SettingsViewModel
) {
    val state by viewModel.state.collectAsState()

    Box(
        modifier = Modifier.fillMaxWidth().fillMaxHeight().padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column {
            Text(state.deviceInfo)
            Row {
                Text("Dark theme", modifier = Modifier.weight(1f))
                Checkbox(state.themeIsDark, onCheckedChange = { viewModel.switchTheme(it) })
            }
        }
    }
}