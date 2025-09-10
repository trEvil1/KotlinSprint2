package org.example.lesson_6

fun main() {
    println("Сколько секунд нужно засеч:")
    val seconds = readln().toLong()
    var counter = seconds
    while (counter > 0) {
        println("Осталось ${counter--} секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}