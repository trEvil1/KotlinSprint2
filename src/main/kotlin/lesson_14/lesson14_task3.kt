package org.example.lesson_14

const val WHITE = "белый"
const val BLACK = "черный"

fun main() {

    val square1 = Rectangle(WHITE, 5, 2)
    val square2 = Rectangle(WHITE, 7, 4)
    val square3 = Rectangle(BLACK, 8, 5)
    val circle1 = Circle(WHITE, 12)
    val circle2 = Circle(BLACK, 3)
    val circle3 = Circle(WHITE, 5)
    val figureList = listOf(square2, square1, square3, circle3, circle2, circle1)

    var totalWhiteAreas = 0.0
    var totalBlackPerimeter = 0.0

    figureList.forEach {
        if (it.color == "черный") {
            totalBlackPerimeter += it.perimeter()
        } else {
            totalWhiteAreas += it.area()
        }
    }
    println(totalBlackPerimeter)
    println("%.2f".format(totalWhiteAreas))
}

abstract class Figure() {
    abstract val color: String

    abstract fun area(): Double

    abstract fun perimeter(): Double

}

class Circle(override val color: String, val radius: Int) : Figure() {
    override fun area(): Double {
        val area = Math.PI * (radius * radius)
        return area
    }

    override fun perimeter(): Double {
        val perimeter = 2 * Math.PI * radius
        return perimeter
    }
}

class Rectangle(override val color: String, val width: Int, val height: Int) : Figure() {
    override fun perimeter(): Double {
        val perimeter = ((width + height) * 2).toDouble()
        return perimeter
    }

    override fun area(): Double {
        val area = (width * height).toDouble()
        return area
    }
}