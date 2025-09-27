package org.example.lesson_18

fun main() {
    val dice4 = Dice4((1..4).random())
    val dice6 = Dice6((1..6).random())
    val dice8 = Dice8((1..8).random())
    val diceList = listOf(dice4, dice6, dice8)
    diceList.forEach { it.throwDice() }
}

abstract class Throw {
    open fun throwDice() {
    }
}

class Dice4(val dice: Int) : Throw() {
    override fun throwDice() {
        println(dice)
    }
}

class Dice6(val dice: Int) : Throw() {
    override fun throwDice() {
        println(dice)
    }
}

class Dice8(var dice: Int) : Throw() {
    override fun throwDice() {
        println(dice)
    }
}
