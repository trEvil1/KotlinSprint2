package org.example.lesson_9

fun main() {
    val listOfIngredients = listOf("яйцо", "молоко", "сливочное масло")
    val listOfAmountIngredients = listOf(2, 50, 15)
    println("Сколко порций нужно?")
    val amountOfPortions = readln().toInt()
    println(
        "На $amountOfPortions порций вам понадобится:" +
                "${listOfIngredients[0]}-${listOfAmountIngredients[0] * amountOfPortions} " +
                "${listOfIngredients[1]}-${listOfAmountIngredients[1] * amountOfPortions} " +
                "${listOfIngredients[2]}-${listOfAmountIngredients[2] * amountOfPortions} "
    )
}