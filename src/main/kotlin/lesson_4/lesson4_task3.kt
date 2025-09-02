package org.example.lesson_4

fun main() {
    val sunnyWeather = true
    val openedTent = true
    val airHumidity = 20
    val partOfYear = "Winter"

    val weatherToday = true
    val openedTentNow = true
    val airHumidityToday = 20
    val partOfYearNow = "Winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${sunnyWeather == weatherToday && openedTent == openedTentNow && airHumidity == airHumidityToday && partOfYearNow != partOfYear}"
    )

}