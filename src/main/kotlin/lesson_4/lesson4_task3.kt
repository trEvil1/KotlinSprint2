package org.example.lesson_4

const val IS_SUNNY = true
const val IS_AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val PART_OF_YEAR = "Winter"
fun main() {


    val weatherToday = true
    val openedTentNow = true
    val airHumidityToday = 20
    val partOfYearNow = "Winter"

    println(
        "Благоприятные ли условия сейчас для роста бобовых? " +
                "${
                    IS_SUNNY == weatherToday
                            && IS_AWNING_OPEN == openedTentNow
                            && AIR_HUMIDITY == airHumidityToday
                            && partOfYearNow != PART_OF_YEAR
                }"
    )

}