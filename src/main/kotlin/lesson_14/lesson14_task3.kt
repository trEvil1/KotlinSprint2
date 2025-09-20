package org.example.lesson_14

fun main() {
    val square1 = Square("белый", 5, 2)
    val square2 = Square("белый", 7, 4)
    val square3 = Square("черный", 8, 5)
    val circle1 = Circle("белый", 12)
    val circle2 = Circle("черный", 3)
    val circle3 = Circle("белый", 5)
    val figureList = mutableListOf(square2, square1, square3, circle3, circle2, circle1)

    val areaList = mutableListOf<Double>()
    val perimeterList = mutableListOf<Double>()

    figureList.map {
        if (it.color == "черный") {
            perimeterList.add(it.perimeter())
        } else {
            areaList.add(it.area())
        }
    }
    println(perimeterList.sum())
    println("%.2f".format(areaList.sum()))
}

abstract class Figure() {
    abstract val color: String

    abstract fun area(): Double

    abstract fun perimeter(): Double

}

class Circle(override val color: String, val radius: Int) : Figure() {
    override fun area(): Double {
        val area = 3.14 * (radius * radius)
        return area
    }

    override fun perimeter(): Double {
        val perimeter = 2 * 3.14 * radius
        return perimeter
    }
}

class Square(override val color: String, val width: Int, val height: Int) : Figure() {
    override fun perimeter(): Double {
        val perimeter = (width + height * 2).toDouble()
        return perimeter
    }

    override fun area(): Double {
        val area = (width * height).toDouble()
        return area
    }
}