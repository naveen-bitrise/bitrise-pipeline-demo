package com.example.android_sample_app.data

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class InMemoryUserRepositoryInstrumentedTest {

    @Test
    fun getUser_onDevice_returnsCorrectUser() {
        val repository = InMemoryUserRepository()
        val user = repository.getUser(1)
        assertNotNull(user)
        assertEquals("Alice", user?.name)
    }

    @Test
    fun getAllUsers_onDevice_returnsAllUsers() {
        val repository = InMemoryUserRepository()
        assertEquals(2, repository.getAllUsers().size)
    }
}
