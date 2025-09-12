package org.example.lesson_9

fun main() {
    val listOfIngredients = listOf("капуста", "салат", "морковь", "томат")
    println("В рецепте есть следущие ингредиенты: $listOfIngredients")
    listOfIngredients.forEach{ println(it) }
}