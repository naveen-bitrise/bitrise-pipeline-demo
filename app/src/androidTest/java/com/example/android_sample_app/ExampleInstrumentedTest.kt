package com.example.android_sample_app

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import java.util.concurrent.TimeUnit

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.android_sample_app", appContext.packageName)
    }

    @Test
    fun longRunningTest() {
        // Test that sleeps for 10 minutes
        println("Starting 10-minute sleep test")
        try {
            // Sleep for 10 minutes (600,000 milliseconds)
            Thread.sleep(TimeUnit.MINUTES.toMillis(10))
            println("10-minute sleep completed")
        } catch (e: InterruptedException) {
            println("Sleep was interrupted: ${e.message}")
            throw e
        }
        // Simple assertion to make sure the test passes after sleeping
        assertTrue(true)
    }


}