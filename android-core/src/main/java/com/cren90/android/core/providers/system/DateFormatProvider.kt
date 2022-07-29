package com.cren90.android.core.providers.system

interface DateFormatProvider {

    /**
     * Returns an whether the system is set to use 24 hour time
     */
    fun is24Hour(): Boolean
}