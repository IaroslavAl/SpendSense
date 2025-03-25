package com.iaroslav_beldin.spendsense.root.model

import com.iaroslav_beldin.spendsense.base.BaseViewState
import com.iaroslav_beldin.spendsense.common.ui.AppPrefs

class RootContract {
    data class State(
        val themeIsDark: Boolean,
        val firstDayIsMonday: Boolean,
        val selectedTab: AppTab
    ) : BaseViewState {
        val appPrefs: AppPrefs
            get() = AppPrefs(firstDayIsMonday = firstDayIsMonday)
        companion object {
            val NONE = State(
                themeIsDark = true,
                firstDayIsMonday = true,
                selectedTab = AppTab.Events
            )
        }
    }
}
