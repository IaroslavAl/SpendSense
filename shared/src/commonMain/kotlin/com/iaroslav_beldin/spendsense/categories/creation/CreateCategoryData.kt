package com.iaroslav_beldin.spendsense.categories.creation

import com.iaroslav_beldin.spendsense.categories.models.Category
import com.iaroslav_beldin.spendsense.platform.randomUUID
import kotlinx.datetime.LocalDateTime

data class CreateCategoryData(
    val title: String,
    val subtitle: String,
    val colorHex: String
)

fun  CreateCategoryData.toCategory(dateTime: LocalDateTime) = Category(
    id = randomUUID(),
    title = title,
    description = subtitle,
    createdAt = dateTime,
    updateAt = dateTime,
    colorHex = colorHex
)