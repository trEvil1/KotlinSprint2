package org.example.lesson_22

fun main() {
    val user = User("user", 1, "pass")
    println(user.toString())
}

data class User(val name: String, val id: Int, val password: String) {
    override fun toString(): String {
        return "$name $id $password"
    }
}