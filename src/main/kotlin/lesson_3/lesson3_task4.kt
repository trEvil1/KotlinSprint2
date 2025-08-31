package org.example.lesson_3

fun main() {
    var turnFrom = "E2"
    var turnTo = "E4"
    var numberOfTurn = "1"
    var turn = "$turnFrom $turnTo Номер хода: $numberOfTurn"
    println(turn)

    turnFrom = "D2"
    turnTo = "D3"
    numberOfTurn = "2"
    turn = "$turnFrom $turnTo Номер хода: $numberOfTurn"

    println(turn)
}