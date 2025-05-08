package com.iaroslav_beldin.spendsense.settings

import com.iaroslav_beldin.spendsense.base.BaseViewState

class SettingsContract {
    data class State(
        val info: String,
        val themeIsDark: Boolean
    ): BaseViewState {
        companion object {
            val NONE = State(
                info = "",
                themeIsDark = false
            )
        }
    }
}