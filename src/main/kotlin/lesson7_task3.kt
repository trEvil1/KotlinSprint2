package org.example

fun main() {
    println("Введите число:")
    val enteredNumber = readln().toInt()
    for (i in 0..enteredNumber) {
        if (i % 2 == 0) {
            println(i)
        } else {
            continue
        }
    }
}