package com.iaroslav_beldin.spendsense.common.ui.calendar.model

import com.iaroslav_beldin.spendsense.common.ui.calendar.extensions.initValue
import com.iaroslav_beldin.spendsense.extensions.now
import kotlinx.datetime.LocalDate


data class CalendarDay(
    val selectable: Boolean,
    val isSelected: Boolean,
    val date: LocalDate,
    val labels: List<CalendarLabel>,
    val isStub: Boolean
) {

    val isToday: Boolean
        get() = date == LocalDate.now()

    val number: Int
        get() = date.dayOfMonth

    companion object {
        val NONE = CalendarDay(
            selectable = true,
            isSelected = false,
            date = LocalDate.initValue(),
            labels = emptyList(),
            isStub = true
        )
    }
}