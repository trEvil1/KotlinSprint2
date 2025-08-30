package org.example.lesson_2

fun main() {
    val seconds = 6532 //я не нашел точное время в секундах =(
    val minutes = seconds/60
    val hour = minutes/60
    val second = seconds%60
    val minute = minutes%60
    println("Время полета : 0$hour:$minute:$second")

}