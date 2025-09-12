package org.example.lesson_9

fun main() {
    println("Введите 5 ингредиентов")
    val listOfIngredients = readln().split(",")
    println(listOfIngredients.toList().sorted())

}