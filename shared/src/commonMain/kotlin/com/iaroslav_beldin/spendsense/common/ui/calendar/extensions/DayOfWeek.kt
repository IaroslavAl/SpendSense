package com.iaroslav_beldin.spendsense.common.ui.calendar.extensions

import kotlinx.datetime.DayOfWeek

fun Array<DayOfWeek>.fromSunday(): List<DayOfWeek> {
    val valuesFromSunday = DayOfWeek.values().toMutableList().apply {
        remove(DayOfWeek.SUNDAY)
    }
    return listOf(DayOfWeek.SUNDAY) + valuesFromSunday
}

