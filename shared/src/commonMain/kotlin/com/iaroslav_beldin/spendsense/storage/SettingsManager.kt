package com.iaroslav_beldin.spendsense.storage

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

object SettingsManager {
    var themeIsDark: Boolean = false
        set(value) {
            _themeIsDarkFlow.update { value }
        }
    private val _themeIsDarkFlow = MutableStateFlow(themeIsDark)
    val themeIsDarkFlow = _themeIsDarkFlow.asStateFlow()
}