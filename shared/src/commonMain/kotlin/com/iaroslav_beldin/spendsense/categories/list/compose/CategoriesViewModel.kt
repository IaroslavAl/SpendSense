package com.iaroslav_beldin.spendsense.categories.list.compose

import com.iaroslav_beldin.spendsense.base.BaseViewModel
import com.iaroslav_beldin.spendsense.base.BaseViewState
import com.iaroslav_beldin.spendsense.categories.CategoriesRepository
import com.iaroslav_beldin.spendsense.categories.creation.CreateCategoryData
import com.iaroslav_beldin.spendsense.categories.creation.toCategory
import com.iaroslav_beldin.spendsense.categories.list.compose.CategoriesViewModel.State
import com.iaroslav_beldin.spendsense.categories.models.Category
import com.iaroslav_beldin.spendsense.extensions.now
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import kotlinx.datetime.LocalDateTime

class CategoriesViewModel(
    private val repository: CategoriesRepository
) : BaseViewModel<State, Nothing>() {

    init {
        activate()
    }

    fun createCategory(
        data: CreateCategoryData
    ) {
        viewModelScope.launch {
            val thisMoment = LocalDateTime.now()
            repository.createCategory(data.toCategory(thisMoment))
        }
    }

    private fun activate() {
        repository.getAllFlow().onEach {
            updateState { copy(categories = it) }
        }.launchIn(viewModelScope)
    }

    data class State(
        val categories: List<Category>
    ) : BaseViewState {
        companion object {
            val NONE = State(categories = emptyList())
        }
    }

    override fun initialState() = State.NONE
}