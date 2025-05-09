package com.iaroslav_beldin.spendsense.categories.models

import com.iaroslav_beldin.spendsense.extensions.now
import kotlinx.datetime.LocalDateTime

data class Category(
    val id: String,
    val title: String,
    val description: String,
    val createdAt: LocalDateTime,
    val updateAt: LocalDateTime,
    val colorHex: String
) {
    companion object {
        val NONE = Category(
            id = "NONE_CATEGORY",
            title = "",
            description = "",
            createdAt = LocalDateTime.now(),
            updateAt = LocalDateTime.now(),
            colorHex = ""
        )
    }
}
