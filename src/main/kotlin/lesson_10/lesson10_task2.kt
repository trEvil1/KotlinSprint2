package org.example.lesson_10

fun main() {
    println("Введите логин")
    val login = checkLength(readln())
    println("Введите пароль")
    val password = checkLength(readln())
    if (login == true && password == true) {
        println("Добро пожаловать")
    } else println("Логин или пароль недостаточно длинные")
}

fun checkLength(length: String): Boolean {
    if (length.length < 4) {
        return false
    } else {
        return true
    }
}