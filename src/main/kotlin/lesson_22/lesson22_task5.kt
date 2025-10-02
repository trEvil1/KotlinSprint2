package org.example.lesson_22

fun main() {
    val galacticGuide = GalacticGuide("Alpha Centauri", "столкновение астероида и планеты", "22:54", 43.1)
    println(galacticGuide.toString())
}

data class GalacticGuide(
    val placeName: String,
    val description: String,
    val timeOfEvent: String,
    val distance: Double
) {
    override fun toString(): String {
        return "В $placeName произошло $description в $timeOfEvent по земному времени на расстоянии $distance световых лет от земли"
    }
}