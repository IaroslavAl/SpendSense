package com.iaroslav_beldin.spendsense.root.model

import com.iaroslav_beldin.spendsense.MR
import dev.icerock.moko.resources.ImageResource
import dev.icerock.moko.resources.StringResource

data class BottomBarItem(
    val title: StringResource,
    val appTab: AppTab,
    val icon: ImageResource
) {
    companion object {
        fun getItems() = listOf(
            BottomBarItem(MR.strings.events, AppTab.Events, MR.images.bottom_bar_events),
            BottomBarItem(MR.strings.categories, AppTab.Categories, MR.images.bottom_bar_categories),
            BottomBarItem(MR.strings.settings, AppTab.Settings, MR.images.bottom_bar_settings),
        )
    }
}
