package org.example.lesson_2

fun main() {
    val clientDeposit = 70000
    val interestRate = 16.7
    val period = 20.0
    val result = ("%.3f".format(clientDeposit * Math.pow(period, 1 + interestRate / 100)))
    println(result)


}