package com.iaroslav_beldin.spendsense.root.compose

import BottomBarItemView
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.iaroslav_beldin.spendsense.common.ui.AppThemeProvider
import com.iaroslav_beldin.spendsense.root.model.AppTab
import com.iaroslav_beldin.spendsense.root.model.BottomBarItem

@Composable
fun BoxScope.RootBottomBar(
    selectedTab: AppTab,
    clickOnTab: (AppTab) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.BottomCenter)
            .background(
                AppThemeProvider.colors.surface,
                shape = RoundedCornerShape(topStart = 22.dp, topEnd = 22.dp)
            )
            .padding(8.dp)
    ) {
        BottomBarItem.getItems().forEach {
            BottomBarItemView(it, it.appTab == selectedTab) {
                clickOnTab(it.appTab)
            }
        }
    }
}