package org.example.lesson_9

fun main() {
    val listOfIngredients = mutableListOf("яблоко", "томат", "салат")
    println("В рецепте есть базовые ингредиенты: $listOfIngredients")
    println("Желаете добавить свой ингредиент?")
    val answer = readln()


    if (answer.equals("Да", true)) {
        println("Какой ингредиент вы хотите добавить?")
        val addIngredient = readln()
        listOfIngredients.add(addIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: $listOfIngredients")
    }

}