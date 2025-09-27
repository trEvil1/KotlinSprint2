package org.example.lesson_18

fun main() {
    val dice4 = Dice4()
    val dice6 = Dice6()
    val dice8 = Dice8()
    val diceList = listOf(dice4, dice6, dice8)
    diceList.forEach { it.throwDice() }
}

abstract class Dice(var dice: Int) {
    open fun throwDice() {
        dice = (1..dice).random()
        println(dice)
    }
}

class Dice4 : Dice(4) {
    override fun throwDice() {
        dice = (1..dice).random()
        println(dice)
    }
}

class Dice6 : Dice(6) {
    override fun throwDice() {
        dice = (1..dice).random()
        println(dice)
    }
}

class Dice8 : Dice(8) {
    override fun throwDice() {
        dice = (1..dice).random()
        println(dice)
    }
}
