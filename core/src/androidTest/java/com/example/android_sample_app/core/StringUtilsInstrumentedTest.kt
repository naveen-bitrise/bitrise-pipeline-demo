package com.example.android_sample_app.core

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class StringUtilsInstrumentedTest {

    @Test
    fun capitalize_onDevice() {
        assertEquals("Android", StringUtils.capitalize("android"))
    }

    @Test
    fun isBlankOrNull_onDevice() {
        assertTrue(StringUtils.isBlankOrNull(null))
    }
}
