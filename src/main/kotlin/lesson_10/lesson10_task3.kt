package org.example.lesson_10

fun main() {
    println("Введите длину пароля")
    val passLength = readln().toInt()
    generatePassword(passLength)
}

fun generatePassword(length: Int) {
    val numbers = "1234567890"
    val symbols = "!\"#$ %&'()*+,-./ "
    var password = ""
    for (i in 1..length) {
        if (i % 2 == 1) {
            password += numbers.random()
        } else password += symbols.random()
    }
    println(password)
}