package com.example.android_sample_app.core

object StringUtils {
    fun capitalize(input: String): String =
        input.replaceFirstChar { it.uppercaseChar() }

    fun isBlankOrNull(input: String?): Boolean = input.isNullOrBlank()
}
