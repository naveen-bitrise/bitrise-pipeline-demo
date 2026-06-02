package com.example.android_sample_app.data

interface UserRepository {
    fun getUser(id: Int): User?
    fun getAllUsers(): List<User>
}
