package org.example.lesson_18

fun main() {
    val screen = Screen()
}

class Screen() {
    fun draw(x: Int, y: Int, figure: String): String {
        return ("$figure, координаты $x:$y")
    }

    fun draw(x: Float, y: Float, figure: String): String {
        return ("$figure, координаты $x:$y")
    }

    fun draw(x: Int, y: Float, figure: String): String {
        return ("$figure, координаты $x:$y")
    }

    fun draw(x: Float, y: Int, figure: String): String {
        return ("$figure, координаты $x:$y")
    }
}