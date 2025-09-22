package org.example.lesson_13

fun main() {
    val user1 = Directory2("user1", 89123456789)
    val user2 = Directory2("user2", 89123456789)
    val user3 = Directory2("user3", 89123456789, "null")
    val user4 = Directory2("user4", 89123456789, "Lol")
    val user5 = Directory2("user5", 89123456789, "OOO")
    val userList = mutableListOf(user5, user4, user3, user2, user1)
    for (user in userList) {
        if (user.company != null) {
            println(user.company)
        }
    }

}

class Directory2(val name: String, val phoneNumber: Long, var company: String? = null)


