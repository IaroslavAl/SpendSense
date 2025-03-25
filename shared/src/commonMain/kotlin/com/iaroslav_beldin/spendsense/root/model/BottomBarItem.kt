package com.iaroslav_beldin.spendsense.root.model

data class BottomBarItem(
    val title: String,
    val appTab: AppTab
) {
    companion object {
        fun getItems() = listOf(
            BottomBarItem("Events", AppTab.Events),
            BottomBarItem("Categories", AppTab.Categories),
            BottomBarItem("Settings", AppTab.Settings),
        )
    }
}
