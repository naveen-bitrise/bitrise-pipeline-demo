package com.example.android_sample_app.feature.home

import com.example.android_sample_app.data.InMemoryUserRepository
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertNull
import org.junit.Before
import org.junit.Test

class HomeViewModelTest {

    private lateinit var viewModel: HomeViewModel

    @Before
    fun setUp() {
        viewModel = HomeViewModel(InMemoryUserRepository())
    }

    @Test
    fun getUsers_returnsNonEmptyList() {
        assert(viewModel.getUsers().isNotEmpty())
    }

    @Test
    fun getUserById_returnsCorrectUser() {
        val user = viewModel.getUserById(1)
        assertNotNull(user)
        assertEquals("Alice", user?.name)
    }

    @Test
    fun getUserById_returnsNullForMissingId() {
        assertNull(viewModel.getUserById(99))
    }
}
