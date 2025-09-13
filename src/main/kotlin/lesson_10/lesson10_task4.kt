package org.example.lesson_10


fun main() {
    var humanWins = 0
    println("Хотите начать игру?")
    var userDesign = readln()
    while (userDesign == "Да") {
        newTurn(userDesign)
        userDesign = readln()
        humanWins += newTurn(userDesign)
    }
    if (userDesign == "Нет") {
        println("Человечество победила $humanWins раз")
    }
}

fun throwDice(): Int {
    val throwDice = (1..6).random()
    return throwDice
}

fun newTurn(design: String): Int {
    var humanWins = 0
    if (design == "Да") {
        val humanDice = throwDice()
        val machineDice = throwDice()
        println("Люди бросили $humanDice")
        println("Машина бросила $machineDice")
        if (humanDice == machineDice) {
            println("Победила дружба")
            println("Хотите продолжить?")
        } else if (humanDice > machineDice) {
            println("Человечество победило")
            humanWins += 1
            println("Хотите продолжить?")
        } else {
            println("Скайнет победил")
            println("Хотите продолжить?")
        }
    }
    return humanWins
}


