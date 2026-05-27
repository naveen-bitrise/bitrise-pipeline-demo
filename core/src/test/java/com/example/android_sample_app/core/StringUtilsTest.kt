package com.example.android_sample_app.core

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class StringUtilsTest {

    @Test
    fun capitalize_returnsFirstCharUppercased() {
        assertEquals("Hello", StringUtils.capitalize("hello"))
    }

    @Test
    fun capitalize_preservesAlreadyCapitalized() {
        assertEquals("World", StringUtils.capitalize("World"))
    }

    @Test
    fun isBlankOrNull_returnsTrueForNull() {
        assertTrue(StringUtils.isBlankOrNull(null))
    }

    @Test
    fun isBlankOrNull_returnsTrueForBlank() {
        assertTrue(StringUtils.isBlankOrNull("   "))
    }

    @Test
    fun isBlankOrNull_returnsFalseForNonBlank() {
        assertFalse(StringUtils.isBlankOrNull("hello"))
    }
}
