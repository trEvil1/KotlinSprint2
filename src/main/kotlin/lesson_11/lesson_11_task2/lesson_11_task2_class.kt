package org.example.lesson_11.lesson_11_task2

class User2(val login: String, var password: String, val email: String, val bio: String) {

    fun passwordChange() {
        println("Введите пароль")
        val enterPassword = readln()
        if (enterPassword == password) {
            println("Введите новый пароль")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен")

        } else println("Пароли не совпадают")
    }

    fun printUserInfo() {
        println("$login $password $email $bio")
    }
}
