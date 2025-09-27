package org.example.lesson_18

import kotlin.math.pow

fun main() {
    val pack1 = CubePack(5.0)
    val pack2 = RectanglePack(4.0, 5.0, 7.0)
    println(listOf(pack2, pack1).forEach { it.getArea() })
}

open class AreaPack {
    open fun getArea() {
    }
}

class CubePack(private val length: Double) : AreaPack() {
    override fun getArea() {
        val area = (6 * length).pow(2)
        println("Посылка куб ее площадь $area")
    }
}

class RectanglePack(private val length: Double, private val width: Double, private val height: Double) : AreaPack() {
    override fun getArea() {
        val area = length * width * height
        println("Посылка прямоугольник ее площадь $area")
    }
}