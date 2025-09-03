package org.example.lesson_5

import kotlin.math.pow

fun main() {
    println("Введите ваш вес")
    val weight = readln().toDouble()
    println("Введите ваш рост")
    val height = readln().toDouble()
    val heightInMeters = height / 100
    val indexOfBody = weight/heightInMeters.pow(2)
    if (indexOfBody<18.5){
        println("Недостаточная масса тела ИМТ:${"%.2f".format(indexOfBody)}")

    }else if(indexOfBody in 18.5..24.9){
        println("Нормальная масса тела ИМТ:${"%.2f".format(indexOfBody)}")

    }else if(indexOfBody in 25.0..29.9){
        println("Избыточная масса тела ИМТ:${"%.2f".format(indexOfBody)}")
    }else if (indexOfBody>=30){
        println("Ожирение ИМТ:${"%.2f".format(indexOfBody)}")
    }
}