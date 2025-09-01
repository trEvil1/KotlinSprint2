package org.example.lesson_2
const val NUMBER_OF_MINUTE_IN_HOUR: Int = 60
fun main() {

    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val departureTime = hourOfDeparture * NUMBER_OF_MINUTE_IN_HOUR + minuteOfDeparture
    val travelTime = 457
    val timeOfWay = departureTime + travelTime
    val hourComing = timeOfWay / NUMBER_OF_MINUTE_IN_HOUR
    val minuteComing = timeOfWay % NUMBER_OF_MINUTE_IN_HOUR
    println("Время прибытия поезда: ${"%02d:%02d".format(hourComing, minuteComing)}")

}