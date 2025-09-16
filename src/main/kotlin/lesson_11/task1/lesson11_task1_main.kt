package org.example.lesson_11.task1

fun main() {
    val user1 = User("admin", "12345", "admin@gmail.com")
    val user2 = User("admin1", "123456", "admin1@gmail.com")
    println(
        "${user1.login}, ${user1.password}, ${user1.email} " +
                ": ${user2.login}, ${user2.password}, ${user2.email}"
    )
}

class User(val login: String, val password: String, val email: String)

