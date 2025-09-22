package org.example.lesson_16

fun main() {
    val circle = Circle(5)
    circle.area()
    circle.perimeter()
}

class Circle(private val radius: Int) {
    private val pi = 3.14
    fun perimeter() {
        val perimeter = 2 * pi * radius
        println("Периметр круга %.2f".format(perimeter))
    }

    fun area() {
        val area = pi * (radius * radius)
        println("Площадь круга %.2f".format(area))
    }
}