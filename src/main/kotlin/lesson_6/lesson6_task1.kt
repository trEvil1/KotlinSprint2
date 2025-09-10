package org.example.lesson_6

fun main() {
    println("Введите новый логин")
    val savedLogin = readln()
    println("Введите пароль")
    val savedPassword = readln()
    var userLogin = ""
    var userPassword = ""
    while (savedPassword != userPassword && userLogin != savedLogin) {
        println("Введите логин")
        userLogin = readln()
        println("Введите пароль")
        userPassword = readln()
        if (savedPassword != userPassword && userLogin != savedLogin) {
            println("Данные не верны, введите заново")
        } else {
            println("Авторизация прошла успешно")
            return
        }
    }
}