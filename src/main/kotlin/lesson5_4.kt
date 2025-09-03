package org.example

fun main() {
    val userName = "Zaphod"
    val userPassword = "PanGalactic"
    val enteredName = readln()
    val enteredPassword = readln()
    if (enteredName == userName) {
        println("Введите пароль")
        if (enteredPassword == userPassword) {
            println("Добро пожаловать")
        } else {
            println("Неверный пароль")
            return
        }
    } else {
        println("Хотите зарегестрироваться?")
        return
    }

}