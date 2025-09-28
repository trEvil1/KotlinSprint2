package org.example.lesson_18

import kotlin.math.pow

fun main() {
    val pack1 = CubePack(5.0)
    val pack2 = RectanglePack(4.0, 5.0, 7.0)
    listOf(pack2, pack1).forEach { println(it.getArea()) }
}

abstract class AreaPack {
    abstract fun getArea(): Double
}

class CubePack(private val length: Double) : AreaPack() {
    override fun getArea(): Double {
        val area = 6 * length.pow(2)
        return area
    }
}

class RectanglePack(private val length: Double, private val width: Double, private val height: Double) : AreaPack() {
    override fun getArea(): Double {
        val area = 2 * (length * width + length * height + height * width)
        return area
    }
}