package org.example.lesson_6

fun main() {
    val winNumber = 5

    var counter = 5
    while (counter > 0) {
        println("Введите число от 1 до 9")
        val enteredNumber = readln().toInt()
        if (winNumber != enteredNumber) {
            println("Неверное число осталось попыток:${--counter}")
        }
        if (enteredNumber == winNumber) {
            println("Поздравляю с победой")
            return
        }
        if (counter == 0) {
            println("Было загаданно число $winNumber")
            return
        }
    }
}