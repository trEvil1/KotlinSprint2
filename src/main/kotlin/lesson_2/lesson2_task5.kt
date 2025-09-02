package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val clientDeposit = 70000
    val interestRate = 16.7
    val period = 20.0
    val result = ("%.3f".format(clientDeposit * (1 + interestRate / 100).pow(period)))
    println(result)

}