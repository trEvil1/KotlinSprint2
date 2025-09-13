package org.example.lesson_8

fun main() {
    val arrayOfIngredients = arrayOf("капуста", "морковь", "паприка", "салат", "морковь")
    println("Список ингредиентов: ${arrayOfIngredients.joinToString(",")}")
    println("Какой ингриедиент вы хотите убрать?")
    val removedIngredient = readln()
    val indexOfRemove = arrayOfIngredients.indexOf(removedIngredient)
    if (indexOfRemove == -1) {
        println("Такого ингредиента нету в списке")
        return
    } else {
        println("Какой ингредиент вы хотите добавить?")
        val addedIngredient = readln()
        arrayOfIngredients[indexOfRemove] = addedIngredient
        println("Готово! Вы сохранили следующий список: ${arrayOfIngredients.joinToString(",")}")
    }
}