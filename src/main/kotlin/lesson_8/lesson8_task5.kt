package org.example.lesson_8

fun main() {
    println("Сколько ингредиентов вы хотите добавить?")
    val numberOfIngredients = readln().toInt()
    val arrayOfIngredients = arrayListOf<String>()
    println("Введите $numberOfIngredients ингредиентов")
    for (i in 0 until numberOfIngredients) {
        val addIngredient = readln()
        arrayOfIngredients.add(addIngredient)
    }
    println(arrayOfIngredients.joinToString(", "))
}