package org.example.lesson_12

import kotlin.random.Random

fun main() {
    val list = mutableListOf<WeatherCast2>()
    for (i in 1..30) {
        list.add(WeatherCast2(Random.nextBoolean(), (10..30).random(), (-5..5).random()))
    }
    val dayTempList = list.map { it.dayTemp }
    println(dayTempList.listAvg())

    val nightTempList = list.map { it.nightTemp }
    println(nightTempList.listAvg())
    var weatherDayCount = 0
    list.map {
        if (it.rainfall) {
            weatherDayCount += 1
        }
    }
    println(weatherDayCount)
}

fun List<Int>.listAvg(): Int {
    return this.sum() / this.size
}

class WeatherCast2(val rainfall: Boolean, val dayTemp: Int, val nightTemp: Int)

