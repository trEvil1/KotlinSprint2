package org.example.lesson_7

const val ALL_CHAR = "qwertyuiopasdfghjklzxcvbnm"
const val ALL_NUMBERS = "1234567890"

fun main() {
    val passwordLength = 6
    val password = mutableListOf<Char>()
    for (i in passwordLength downTo 1) {
        if (i % 2 == 1) {
            password.add(ALL_CHAR.random())
        }
        if (i % 2 == 0) {
            password.add(ALL_NUMBERS.random())
        }
    }
    println(password.joinToString(""))
}