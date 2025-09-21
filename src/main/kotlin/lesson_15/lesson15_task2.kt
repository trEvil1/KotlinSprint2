package org.example.lesson_15

fun main() {
    val weatherServer = WeatherServer()
    val precipitation = PrecipitationAmount(333, "Мы тонем")
    val temperature = Temperature("Мы горим", 555)

    weatherServer.printMessage(precipitation)
    weatherServer.printMessage(temperature)
}

abstract class WeatherStationStats() {
    abstract val message: String

}

class Temperature(override val message: String, val temperature: Int) : WeatherStationStats()

class PrecipitationAmount(val precipitation: Int, override val message: String) : WeatherStationStats()

class WeatherServer() {
    fun printMessage(message: WeatherStationStats) {
        if (message is Temperature) {
            println("${message.temperature} ${message.message}")
        } else if (message is PrecipitationAmount) println("${message.precipitation} ${message.message}")
    }
}
