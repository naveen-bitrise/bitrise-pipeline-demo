package com.example.android_sample_app.data

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test

class InMemoryUserRepositoryTest {

    private lateinit var repository: UserRepository

    @Before
    fun setUp() {
        repository = InMemoryUserRepository()
    }

    @Test
    fun getUser_returnsCorrectUser() {
        val user = repository.getUser(1)
        assertEquals("Alice", user?.name)
    }

    @Test
    fun getUser_returnsNullForMissingId() {
        assertNull(repository.getUser(99))
    }

    @Test
    fun getAllUsers_returnsAllUsers() {
        assertEquals(2, repository.getAllUsers().size)
    }
}
