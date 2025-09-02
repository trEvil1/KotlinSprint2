package org.example.lesson_4

fun main() {
    val damage = false
    val minCrew = 55
    val maxCrew = 70
    val weather = true
    val supplies = 50

    val crewCurrent = 70
    val suppliesCurrent = 45

    println(
        damage == false && crewCurrent >= minCrew && crewCurrent >= maxCrew && weather == true && suppliesCurrent > supplies
                || damage == true && weather == true && crewCurrent == maxCrew && suppliesCurrent > supplies
    )

}