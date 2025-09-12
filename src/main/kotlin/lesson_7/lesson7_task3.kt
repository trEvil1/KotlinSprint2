package org.example.lesson_7

fun main() {
    println("Введите число:")
    val enteredNumber = readln().toInt()
    for (i in 0..enteredNumber step 2) {

        println(i)

    }
}