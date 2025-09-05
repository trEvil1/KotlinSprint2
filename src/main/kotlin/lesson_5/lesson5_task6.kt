package org.example.lesson_5

import kotlin.math.pow

fun main() {
    println("Введите ваш вес")
    val weight = readln().toDouble()
    println("Введите ваш рост")
    val height = readln().toDouble()
    val heightInMeters = height / 100
    val indexOfBody = weight / heightInMeters.pow(2)
    val index = when {
        indexOfBody < 18.5 -> "Недостаточная масса тела ИМТ:${"%.2f".format(indexOfBody)}"
        indexOfBody < 25 -> "Нормальная масса тела ИМТ:${"%.2f".format(indexOfBody)}"
        indexOfBody < 30 -> "Избыточная масса тела ИМТ:${"%.2f".format(indexOfBody)}"
        indexOfBody >= 30 -> "Ожирение ИМТ:${"%.2f".format(indexOfBody)}"
        else -> {
            "Неверные данные"
        }

    }
    println(index)
}
