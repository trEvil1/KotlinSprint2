package org.example.lesson_18

fun main() {
    val throw1 = Dice4()
    val throw2 = Dice6()
    val throw3 = Dice8()
    val diceList = listOf(throw1, throw2, throw3)
    println(diceList.forEach { it.throwDice() })
}

interface Throw {
    fun throwDice()
}

class Dice4(val dice: Int = (1..4).random()) : Throw {
    override fun throwDice() {
        println(dice)
    }
}

class Dice6(val dice: Int = (1..6).random()) : Throw {
    override fun throwDice() {
        println(dice)
    }
}

class Dice8(var dice: Int = (1..8).random()) : Throw {
    override fun throwDice() {
        println(dice)
    }
}
