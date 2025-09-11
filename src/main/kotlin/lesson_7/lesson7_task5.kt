package org.example.lesson_7

const val ALL_SYMBOLS = "qwertyuiopasdfghjklzxcvbnm1234567890QWERTYUIOPASDFGHJKLZXCVBNM"
const val SMALL_CHAR = "qwertyuiopasdfghjklzxcvbnm"
const val BIG_CHAR = "QWERTYUIOPASDFGHJKLZXCVBNM"
const val NUMBERS = "1234567890"

fun main() {
    val passwordLength = readln().toInt()
    val minPassword = 6
    var password = ""
    if (passwordLength < minPassword) {
        println("Минимальная длина пароля 6 символов")
        return
    }
    for (i in passwordLength downTo 1) {
        val random = ALL_SYMBOLS.random()
        password += random
    }

    var number = 2
    var randomNumber = NUMBERS.random()
    val passwordCharArray = password.toCharArray()
    passwordCharArray[number] = randomNumber

    number = 4
    randomNumber = SMALL_CHAR.random()
    passwordCharArray[number] = randomNumber

    number = 5
    randomNumber = BIG_CHAR.random()
    passwordCharArray[number] = randomNumber

    println(passwordCharArray)

}

