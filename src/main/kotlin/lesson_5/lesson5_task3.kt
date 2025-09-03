package org.example.lesson_5

const val WIN_NUMBER1 = 42
const val WIN_NUMBER2 = 5
fun main() {
    val enteredNumber1 = readln().toInt()
    val enteredNumber2 = readln().toInt()
    if (enteredNumber2 >= 42 || enteredNumber2 <= 0 || enteredNumber1 >= 42 || enteredNumber2 <= 0) {
        println("Одно из введенных чисел не верно")
    } else if (enteredNumber2 == WIN_NUMBER2 && enteredNumber1 == WIN_NUMBER1 || enteredNumber1 == WIN_NUMBER2 && enteredNumber2 == WIN_NUMBER1) {
        println("Поздравляю вы выйграли")
    } else {
        println("Не повезло")
    }
}