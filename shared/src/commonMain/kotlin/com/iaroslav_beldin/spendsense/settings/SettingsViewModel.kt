package com.iaroslav_beldin.spendsense.settings

import com.iaroslav_beldin.spendsense.base.BaseViewModel
import com.iaroslav_beldin.spendsense.platform.DeviceInfo
import com.iaroslav_beldin.spendsense.storage.SettingsManager
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class SettingsViewModel(
    private val deviceInfo: DeviceInfo,
    private val settingsManager: SettingsManager
) : BaseViewModel<SettingsContract.State, Nothing>() {
    init {
        settingsManager.themeIsDarkFlow.onEach {
            updateState { copy(themeIsDark = it) }
        }.launchIn(viewModelScope)

        updateState {
            copy(info = deviceInfo.getSummary())
        }
    }

    override fun initialState() = SettingsContract.State.NONE

    fun switchTheme(isDark: Boolean) {
        settingsManager.themeIsDark = isDark
    }
}