package org.example.lesson_16

import kotlin.math.pow

fun main() {
    val circle = Circle(5.0)
    circle.area()
    println("Периметр %.2f".format(circle.perimeter()))
    println("Площадь %.2f".format(circle.area()))
}

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun perimeter(): Double = 2 * PI * radius

    fun area(): Double = PI * radius.pow(2)

}