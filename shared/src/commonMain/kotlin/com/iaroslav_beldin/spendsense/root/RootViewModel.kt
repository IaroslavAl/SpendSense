package com.iaroslav_beldin.spendsense.root

import com.iaroslav_beldin.spendsense.base.BaseViewModel
import com.iaroslav_beldin.spendsense.root.model.AppTab
import com.iaroslav_beldin.spendsense.root.model.RootContract.State
import com.iaroslav_beldin.spendsense.storage.SettingsManager
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class RootViewModel(
    private val settingsManager: SettingsManager
): BaseViewModel<State, Nothing>() {
    init {
        settingsManager.themeIsDarkFlow.onEach { isDark ->
            updateState { copy(themeIsDark = isDark) }
        }.launchIn(viewModelScope)
    }

    override fun initialState() = State.NONE

    fun handleClickOnTab(appTab: AppTab) = updateState {
        copy(selectedTab = appTab)
    }
}