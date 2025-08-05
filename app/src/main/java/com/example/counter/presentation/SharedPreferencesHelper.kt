package com.example.counter.presentation

import android.content.Context
import android.content.SharedPreferences

const val PREF_NAME = "counter_prefs"
const val COUNTER_KEY = "counter_value"

fun saveCounter(context: Context, count: Int) {
    val prefs: SharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    prefs.edit().putInt(COUNTER_KEY, count).apply()
}

fun loadCounter(context: Context): Int {
    val prefs: SharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    return prefs.getInt(COUNTER_KEY, 0) // Default to 0
}