package org.example.lesson_12

fun main() {

    val weatherForecast1 = WeatherForecast()
    weatherForecast1.dayTemp = 32
    weatherForecast1.nightTemp = 5
    weatherForecast1.rainfall = false
    val weatherForecast2 = WeatherForecast()
    weatherForecast2.dayTemp = 25
    weatherForecast2.nightTemp = 15
    weatherForecast2.rainfall = false
    println("${weatherForecast2.dayTemp}, ${weatherForecast2.nightTemp}, ${weatherForecast2.rainfall}")
    println("${weatherForecast1.dayTemp}, ${weatherForecast1.nightTemp}, ${weatherForecast1.rainfall}")

}

class WeatherForecast() {
    var dayTemp = 20
    var nightTemp = 10
    var rainfall = true

}