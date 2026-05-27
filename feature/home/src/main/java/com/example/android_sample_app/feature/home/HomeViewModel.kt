package com.example.android_sample_app.feature.home

import androidx.lifecycle.ViewModel
import com.example.android_sample_app.data.User
import com.example.android_sample_app.data.UserRepository

class HomeViewModel(private val userRepository: UserRepository) : ViewModel() {

    fun getUsers(): List<User> = userRepository.getAllUsers()

    fun getUserById(id: Int): User? = userRepository.getUser(id)
}
