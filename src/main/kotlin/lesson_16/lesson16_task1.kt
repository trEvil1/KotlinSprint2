package org.example.lesson_16

fun main() {
    val dice = Dice()
    dice.print()
}

class Dice(val randomNumber: Int = (1..6).random()) {
    fun print() {
        println(randomNumber)
    }
}