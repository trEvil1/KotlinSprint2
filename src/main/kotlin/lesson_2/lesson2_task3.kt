package org.example.lesson_2

fun main() {
    val numberOfMinuteInHour = 60
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val departureTime = hourOfDeparture * numberOfMinuteInHour + minuteOfDeparture
    val travelTime = 457
    val timeOfWay = departureTime + travelTime
    val hourComing = timeOfWay / numberOfMinuteInHour
    val minuteComing = timeOfWay % numberOfMinuteInHour
    println("Время прибытия поезда: ${"%02d:%02d".format(hourComing, minuteComing)}")

}