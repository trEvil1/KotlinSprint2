package org.example.lesson_2

fun main() {
    val seconds = 6480
    val a = 60
    val minutes = seconds / a
    val hour = minutes / a
    val second = seconds % a
    val minute = minutes % a

    println("Время полета : ${"%02d".format(hour) + ":" + "%02d".format(minute) + ":" + "%02d".format(second)}")

}