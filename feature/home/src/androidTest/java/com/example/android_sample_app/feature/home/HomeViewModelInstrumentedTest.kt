package com.example.android_sample_app.feature.home

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.android_sample_app.data.InMemoryUserRepository
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeViewModelInstrumentedTest {

    @Test
    fun getUsers_onDevice_returnsNonEmptyList() {
        val viewModel = HomeViewModel(InMemoryUserRepository())
        assertTrue(viewModel.getUsers().isNotEmpty())
    }

    @Test
    fun getUserById_onDevice_returnsCorrectUser() {
        val viewModel = HomeViewModel(InMemoryUserRepository())
        assertEquals("Alice", viewModel.getUserById(1)?.name)
    }
}
