package org.example.lesson_7

fun main() {
    var randomNumber = (1000..9999).random().toString()
    var enteredNumber = ""
    while (enteredNumber != randomNumber) {
        randomNumber = (1000..9999).random().toString()
        println("Ваш код авторизации $randomNumber")
        println("Введите код:")
        enteredNumber = readln()
    }
    if (enteredNumber == randomNumber) {
        println("Добро пожаловать!")
        return
    }
}

