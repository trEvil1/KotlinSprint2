package org.example.lesson_8

fun main() {
    println("Сколько ингредиентов вы хотите добавить?")
    val numberOfIngredients = readln().toInt()
    var arrayOfIngredients = emptyArray<String>()
    println("Введите $numberOfIngredients ингредиентов")
    for (i in 0 until numberOfIngredients) {
        val addIngredient = readln()
        arrayOfIngredients += addIngredient
    }
    println(arrayOfIngredients.joinToString(","))
}