package org.example.lesson_10

fun main() {
    val humanDice = throwDice()
    val machineDice = throwDice()
    println("Люди бросили $humanDice")
    println("Машина бросила $machineDice")
    if (humanDice == machineDice) {
        println("Победила дружба")
    } else if (humanDice > machineDice) {
        println("Человечество победило")
    } else println("Скайнет победил")
}

fun throwDice(): Int {
    val throwDice = (1..6).random()
    return throwDice
}