package org.example.lesson_7

const val ALL_SYMBOLS = "qwertyuiopasdfghjklzxcvbnm1234567890"

fun main() {
    val passwordLength = 6
    var password = ""
    for (i in passwordLength downTo 1) {
        val random = ALL_SYMBOLS.random()
        password += random
    }
    println(password)
}