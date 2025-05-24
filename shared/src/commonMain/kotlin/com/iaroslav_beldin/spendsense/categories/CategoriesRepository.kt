package com.iaroslav_beldin.spendsense.categories

import com.iaroslav_beldin.spendsense.categories.models.Category
import kotlinx.coroutines.flow.flow

class CategoriesRepository {
    fun getAllFlow() = flow { emit(
        List(20) { index ->
            Category.NONE.copy(
                id = index.toString(),
                title = "category $index"
            )
        }
    ) }

    suspend fun createCategory(category: Category) = Unit
}