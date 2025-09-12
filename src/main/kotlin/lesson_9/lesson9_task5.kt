package org.example.lesson_9

import java.util.*

fun main() {
    println("Введите пять ингредиентов")
    val listOfIngredients = mutableListOf<String>()
    while (listOfIngredients.lastIndex < 4) {
        val ingredient = readln()
        if (ingredient in listOfIngredients) {
            println("$ingredient уже есть в списке")
        } else listOfIngredients.add(ingredient)
    }
    val ingredientsString = listOfIngredients.sorted().joinToString()
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    println(ingredientsString)
}
