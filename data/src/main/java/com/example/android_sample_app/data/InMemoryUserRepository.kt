package com.example.android_sample_app.data

class InMemoryUserRepository : UserRepository {

    private val users = mutableListOf(
        User(1, "Alice", "alice@example.com"),
        User(2, "Bob", "bob@example.com"),
    )

    override fun getUser(id: Int): User? = users.find { it.id == id }

    override fun getAllUsers(): List<User> = users.toList()
}
