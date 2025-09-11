package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("паприка", "салат", "помидор", "капуста", "морковь")
    println("Какой ингридент вы ищите?")
    val searchIngredient = readln()
    for (i in arrayOfIngredients) {
        if (searchIngredient in arrayOfIngredients) {
            println("Ингридиент $searchIngredient в рецепте есть")
            return
        }
    }
    if (searchIngredient !in arrayOfIngredients) {
        println("Ингридиента $searchIngredient в рецепте нету")
    }
}

