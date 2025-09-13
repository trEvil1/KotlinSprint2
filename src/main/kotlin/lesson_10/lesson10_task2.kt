package org.example.lesson_10

fun main() {
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()
    if (checkLength(login) < 4 || checkLength(password) < 4) {
        println("Логин или пароль недостаточно длинные")
    } else println("Добро пожаловать")
}

fun checkLength(length: String): Int {
    val checkLength = length.length
    return checkLength
}