package org.example.lesson_4

const val IS_SHIP_DAMAGED = false
const val MIN_CREW = 55
const val MAX_CREW = 70
const val IS_WEATHER_SUNNY = true
const val SUPPLIES = 50
fun main() {


    val crewCurrent = 70
    val suppliesCurrent = 45

    println(
        IS_SHIP_DAMAGED == false
                && crewCurrent >= MIN_CREW
                && crewCurrent >= MAX_CREW
                && IS_WEATHER_SUNNY == true
                && suppliesCurrent > SUPPLIES
                || IS_SHIP_DAMAGED == true
                && IS_WEATHER_SUNNY == true
                && crewCurrent == MAX_CREW
                && suppliesCurrent > SUPPLIES
    )

}