package org.example.lesson_2

fun main() {
    var seconds = 6532 //я не нашел точное время в секундах =(
    var minute = seconds/60
    var hour = minute/60
    seconds = seconds%60
    minute = minute%60
    println("Время полета : 0$hour:$minute:$seconds")
}