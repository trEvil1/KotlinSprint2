package org.example.lesson_7

const val ALL_CHAR = "qwertyuiopasdfghjklzxcvbnm"
const val ALL_NUMBERS = "1234567890"

fun main() {
    val passwordLength = 3
    val password = mutableListOf<Char>()
    for (i in passwordLength downTo 1) {
        val randomChar = ALL_CHAR.random()
        val randomNumber = ALL_NUMBERS.random()
        password.add(randomChar)
        password.add(randomNumber)
    }
    println(password.joinToString(""))
}