@file:Suppress("unused")

package com.cren90.android.core.extensions

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.toFormattedString(format: SimpleDateFormat): String = format.format(this.time)
fun Calendar.fromFormattedString(format: SimpleDateFormat, timeString: String): Calendar {
    try {
        format.parse(timeString)?.let {
            time = it
        }
    } catch (_: Exception) {
    }
    return this
}

