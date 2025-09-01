package org.example.lesson_3

fun main() {
    val playerTurn = "D2-D4;0"
    val split = playerTurn.split("-", ";")
    val from = listOf(split[0])
    val to = listOf(split[1])
    val turnNumber = listOf(split[2])
    println(from + to + turnNumber)
}