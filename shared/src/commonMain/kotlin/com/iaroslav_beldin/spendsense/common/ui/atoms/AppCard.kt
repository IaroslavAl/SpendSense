package com.iaroslav_beldin.spendsense.common.ui.atoms

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iaroslav_beldin.spendsense.common.ui.AppThemeProvider

@Composable
fun AppCard(content: @Composable ColumnScope.() -> Unit) {
    Card(
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        colors = CardDefaults.cardColors(
            containerColor = AppThemeProvider.colors.surface,
            contentColor = AppThemeProvider.colors.onSurface
        )
    ) {
        content()
    }
}