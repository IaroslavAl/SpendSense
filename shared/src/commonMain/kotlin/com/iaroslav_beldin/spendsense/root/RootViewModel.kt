package com.iaroslav_beldin.spendsense.root

import com.iaroslav_beldin.spendsense.base.BaseViewModel
import com.iaroslav_beldin.spendsense.root.RootContract.*
import com.iaroslav_beldin.spendsense.storage.SettingsManager
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class RootViewModel: BaseViewModel<State, Nothing>() {
    init {
        SettingsManager.themeIsDarkFlow.onEach { isDark ->
            updateState { copy(themeIsDark = isDark) }
        }.launchIn(viewModelScope)
    }
    override fun initialState() = State.NONE
}