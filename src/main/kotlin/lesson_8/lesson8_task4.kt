package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("капуста", "морковь", "паприка", "салат", "морковь")
    println("Список ингредиентов: ${arrayOfIngredients.joinToString(",")}")
    println("Какой ингриедиент вы хотите убрать?")
    val removedIngredient = readln()
    if (removedIngredient !in arrayOfIngredients) {
        println("Такого ингредиента нету в списке")
        return
    }
    println("Какой ингредиент вы хотите добавить?")
    val addedIngredient = readln()
    val replaceIndex = arrayOfIngredients.indexOf(removedIngredient)
    arrayOfIngredients[replaceIndex] = addedIngredient
    println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString(",")}")
}