package org.example.lesson_7

fun main() {
    println("Сколько секунд засечь?")
    var seconds = readln().toInt()
    for (i in 0..seconds) {
        println("Осталось ${seconds--} секунд")
        Thread.sleep(1000)
    }
    println("Время вышло")
}