package org.example.lesson_9

fun main() {
    val listOfIngredients = listOf("яйцо", "молоко", "сливочное масло")
    val listOfAmountIngredients = listOf(2, 50, 15)
    println("Сколько порций нужно?")
    val amountOfPortions = readln().toInt()

    println(
        "На $amountOfPortions поций вам понадобится " +
                listOfAmountIngredients.map {
                    (it * amountOfPortions).toString() + "-" + listOfIngredients.get(
                        listOfAmountIngredients.indexOf(it)
                    )
                }.joinToString(", ")
    )
}

