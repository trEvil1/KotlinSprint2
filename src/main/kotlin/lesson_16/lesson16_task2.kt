package org.example.lesson_16

fun main() {
    val circle = Circle(5)
    circle.area()
    println("Периметр %.2f".format(circle.perimeter()))
    println("Площадь %.2f".format(circle.area()))
}

private const val PI = 3.14

class Circle(private val radius: Int) {

    fun perimeter(): Double {
        val perimeter = 2 * PI * radius
        return perimeter
    }

    fun area(): Double {
        val area = PI * Math.pow(radius.toDouble(), 2.0)
        return area
    }
}