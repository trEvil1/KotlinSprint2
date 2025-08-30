package org.example.lesson_2

fun main() {
    val seconds = 6480
    val numberOfSecond = 60
    val minutes = seconds / numberOfSecond
    val hour = minutes / numberOfSecond
    val second = seconds % numberOfSecond
    val minute = minutes % numberOfSecond

    println("Время полета : ${"%02d:%02d:%02d".format(hour, minute, second)}")

}