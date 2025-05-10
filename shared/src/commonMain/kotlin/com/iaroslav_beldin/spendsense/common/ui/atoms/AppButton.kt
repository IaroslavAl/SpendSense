package com.iaroslav_beldin.spendsense.common.ui.atoms

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iaroslav_beldin.spendsense.common.ui.AppThemeProvider

@Composable
fun AppButton(
    title: String,
    modifier: Modifier,
    onClick: () -> Unit
) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = AppThemeProvider.colors.background,
            contentColor = AppThemeProvider.colors.onSurface
        ),
        border = BorderStroke(
            width = 1.dp,
            color = AppThemeProvider.colors.onSurface
        )
    ) {
        Text(
            text = title,
            color = AppThemeProvider.colors.onSurface
        )
    }
}