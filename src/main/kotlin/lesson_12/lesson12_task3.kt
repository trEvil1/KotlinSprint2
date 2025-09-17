package org.example.lesson_12

fun main() {
    val weatherCast = WeatherCast1()
    weatherCast.printWeatherCast()
}

class WeatherCast1() {
    var dayTemp = 300
    var nightTemp = 280
    var rainfall = true

    fun printWeatherCast() {
        val kelvin = 273
        val weather = WeatherCast1()
        println("${weather.dayTemp - kelvin}, ${weather.nightTemp - kelvin}, ${weather.rainfall}")
    }
}