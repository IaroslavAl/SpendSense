package com.iaroslav_beldin.spendsense.root.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import com.iaroslav_beldin.spendsense.categories.CategoriesScreen
import com.iaroslav_beldin.spendsense.common.ui.AppTheme
import com.iaroslav_beldin.spendsense.common.ui.AppThemeProvider
import com.iaroslav_beldin.spendsense.di.getKoinInstance
import com.iaroslav_beldin.spendsense.events.EventsScreen
import com.iaroslav_beldin.spendsense.root.RootViewModel
import com.iaroslav_beldin.spendsense.root.model.AppTab
import com.iaroslav_beldin.spendsense.settings.compose.SettingsScreen

@Composable
fun RootScreen() {
    val viewModel = getKoinInstance<RootViewModel>()
    val state by viewModel.state.collectAsState()

    AppTheme(
        themeIsDark = state.themeIsDark,
        appPrefs = state.appPrefs
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .systemBarsPadding()
                .background(AppThemeProvider.colors.background)
        ) {
            RootNavigation(state.selectedTab)
            RootBottomBar(state.selectedTab) {
                viewModel.handleClickOnTab(it)
            }
        }
    }
}

@Composable
fun BoxScope.RootNavigation(selectedTab: AppTab) {
    when(selectedTab) {
        AppTab.Categories -> CategoriesScreen(getKoinInstance())
        AppTab.Events -> EventsScreen()
        AppTab.Settings -> SettingsScreen(getKoinInstance())
    }
}