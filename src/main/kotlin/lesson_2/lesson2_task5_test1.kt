package org.example.lesson_2

fun main() {
    val seconds = 6480
    val a = 60
    val minutes = seconds / a
    val hour = minutes / 60
    val second = seconds % 60
    val minute = minutes % 60

    println("Время полета : ${"%02d".format(hour) + ":" + "%02d".format(minute) + ":" + "%02d".format(second)}")

}