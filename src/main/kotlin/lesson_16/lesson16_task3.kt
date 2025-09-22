package org.example.lesson_16

fun main() {
    val user = User(login = "user1")
    println(user.checkPassword("123"))
}

class User(private val password: String = "1234", val login: String) {
    fun checkPassword(password: String): Boolean {
        if (password == this.password) {
            return true
        } else return false
    }
}