package org.example.lesson_6


fun main() {
    println("Сколько секунд нужно засеч:")
    val seconds = readln().toLong()
    val timer = seconds * 1000
    Thread.sleep(timer)
    println("Прошло $seconds секунд")


}