package org.example.lesson_12

fun main() {
    val weatherCast = WeatherCast(32, 15, true)
    println("${weatherCast.dayTemp}, ${weatherCast.nightTemp}, ${weatherCast.rainfall}")
}

class WeatherCast(_dayTemp:Int, _nightTemp:Int, _rainfall:Boolean) {
    var dayTemp = _dayTemp
    var nightTemp = _nightTemp
    var rainfall = _rainfall

}