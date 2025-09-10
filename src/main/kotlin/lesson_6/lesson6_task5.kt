package org.example.lesson_6

fun main() {
    var counter = 3
    while (counter > 0) {
        val number1 = (1..9).random()
        val number2 = (1..9).random()
        println("$number2 + $number1 =")
        val winNumber = number2 + number1
        val enteredNumber = readln().toInt()
        if (counter == 1) {
            println("Начините сначала")
            return
        }
        if (enteredNumber == winNumber) {
            println("Вы прошли проверку")
            return
        } else {
            println("Попробуйте снова")
        }
        println("Осталось попыток ${--counter}")
    }
}