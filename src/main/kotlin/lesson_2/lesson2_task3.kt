package org.example.lesson_2

fun main() {
    val departureTime = 579
    val travelTime = 457
    val hourComing = (departureTime+travelTime)/60
    val minuteComing = (departureTime+travelTime)%60
    println("Время прибытия поезда: $hourComing:$minuteComing")

}