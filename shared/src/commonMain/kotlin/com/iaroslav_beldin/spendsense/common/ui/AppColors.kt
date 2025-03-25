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
    accent = Color(0xFF00BCD4),  // бирюзовый
    surface = Color(0xFFE0F7FA),  // светлый голубой
    onSurface = Color(0xFF006064),  // темный бирюзовый
    background = Color(0xFFB2EBF2),  // пастельный голубой
    onBackground = Color(0xFF00838F),  // средний бирюзовый
)

val darkPalette = AppColors(
    accent = Color(0xFF4DD0E1),  // светлый бирюзовый
    surface = Color(0xFF000F1A),  // очень темный синий
    onSurface = Color(0xFFE0F7FA),  // светлый голубой
    background = Color(0xFF001F29),  // темный сине-зеленый
    onBackground = Color(0xFF80DEEA),  // пастельный бирюзовый
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