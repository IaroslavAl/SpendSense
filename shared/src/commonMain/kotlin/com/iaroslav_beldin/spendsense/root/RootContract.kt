package com.iaroslav_beldin.spendsense.root

import com.iaroslav_beldin.spendsense.base.BaseViewState
import com.iaroslav_beldin.spendsense.common.ui.AppPrefs

class RootContract {
    data class State(
        val themeIsDark: Boolean,
        val firstDayIsMonday: Boolean
    ) : BaseViewState {
        val appPrefs: AppPrefs
            get() = AppPrefs(firstDayIsMonday = firstDayIsMonday)
        companion object {
            val NONE = State(
                themeIsDark = true,
                firstDayIsMonday = true
            )
        }
    }
}
