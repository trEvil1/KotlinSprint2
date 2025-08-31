package org.example.lesson_2

fun main() {
    val number = 60
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val departureTime = hourOfDeparture * number + minuteOfDeparture
    val travelTime = 457
    val time = departureTime + travelTime
    val hourComing = time / number
    val minuteComing = time % number
    println("Время прибытия поезда: ${"%02d:%02d".format(hourComing, minuteComing)}")

}