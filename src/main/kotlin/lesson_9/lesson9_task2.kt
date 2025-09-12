package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("яблоко", "томат", "салат")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")
    println("Желаете добавить свой ингредиент?")
    val solution = readln()
    val agree = "Да"
    if (solution.equals(agree, true)) {
        println("Какой ингредиент вы хотите добавить?")
    } else return
    val addIngredient = readln()
    listOfIngredients.add(addIngredient)
    println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
}