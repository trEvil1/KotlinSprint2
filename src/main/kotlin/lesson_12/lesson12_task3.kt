package org.example.lesson_12

fun main() {
    val weatherCast = WeatherCast1(300,312, true)
    weatherCast.printWeatherCast()
}

class WeatherCast1(
    var dayTemp: Int,
    var nightTemp: Int,
    var rainfall: Boolean
) {


    fun printWeatherCast() {
        val kelvin = 273
        println("${dayTemp - kelvin}, ${nightTemp - kelvin}, ${rainfall}")

    }
}