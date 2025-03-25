package com.iaroslav_beldin.spendsense.common.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color

data class AppColors(
    val accent: Color,
    val surface: Color,
    val onSurface: Color,
    val background: Color,
    val onBackground: Color
)

val lightPalette = AppColors(
    accent = Color(0xFFFFF59D),
    surface = Color(0xFFD7FFEA),
    onSurface = Color(0xFF001329),
    background = Color(0xFF8DC2A6),
    onBackground = Color(0xFF133050),
)

val darkPalette = AppColors(
    accent = Color(0xFFAF9363),
    surface = Color(0xFF060D16),
    onSurface = Color(0xFFF6F6F6),
    background = Color(0xFF0D1E31),
    onBackground = Color(0xFF99A6B5),
)

object AppThemeProvider {
    val colors: AppColors
        @Composable
        @ReadOnlyComposable
        get() = LocalAppColors.current

    val appPrefs: AppPrefs
        @Composable
        @ReadOnlyComposable
        get() = LocalAppPrefs.current
}