package org.example.lesson_7

fun main() {
    val numberGenerator = (1000..9999).random().toString()
    var randomNumber = numberGenerator
    var enteredNumber = ""
    while (enteredNumber != randomNumber) {
        randomNumber = numberGenerator
        println("Ваш код авторизации $randomNumber")
        println("Введите код:")
        enteredNumber = readln()
    }
    if (enteredNumber == randomNumber) {
        println("Добро пожаловать!")
        return
    }
}

