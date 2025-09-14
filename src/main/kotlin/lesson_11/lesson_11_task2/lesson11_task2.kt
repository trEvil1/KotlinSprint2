package org.example.lesson_11.lesson_11_task2

fun main() {
    val userInfo: User2 = User2("admin1", "pass", "lol@gmail.com", "male")
    userInfo.passwordChange()
    userInfo.printUserInfo()
}