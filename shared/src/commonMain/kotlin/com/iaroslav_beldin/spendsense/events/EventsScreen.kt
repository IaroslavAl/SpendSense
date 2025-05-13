package com.iaroslav_beldin.spendsense.events

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import com.iaroslav_beldin.spendsense.common.ui.AppThemeProvider
import com.iaroslav_beldin.spendsense.common.ui.calendar.compose.CalendarColors
import com.iaroslav_beldin.spendsense.common.ui.calendar.compose.DatePickerView
import com.iaroslav_beldin.spendsense.di.getKoinInstance

@Composable
fun BoxScope.EventsScreen() {
    DatePickerView(
        viewModel = getKoinInstance(),
        colors = CalendarColors.default.copy(
            colorSurface = AppThemeProvider.colors.surface,
            colorOnSurface = AppThemeProvider.colors.onSurface,
            colorAccent = AppThemeProvider.colors.accent
        ),
        firstDayIsMonday = AppThemeProvider.appPrefs.firstDayIsMonday,
        labels = emptyList(),
        selectDayListener = { day -> }
    )
}