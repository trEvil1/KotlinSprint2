package org.example.lesson_4

const val minWeight = 35
const val maxWeight = 100
const val maxVolume = 100
fun main() {

    val cargoWeight1 = 20
    val cargoVolume1 = 0
    val cargoWeight2 = 50
    val cargoVolume2 = 80
    val cargoWeight3 = 0
    val cargoVolume3 = 100
    println(
        "Груз весом $cargoWeight1 кг и объемом $cargoVolume1 литров соответствует категории 'Average':" +
                "${cargoVolume1 < maxVolume && cargoWeight1 > minWeight && cargoWeight1 <= maxWeight}"
    )
    println(
        "Груз весом $cargoWeight2 кг и объемом $cargoVolume2 литров соответствует категории 'Average':" +
                "${cargoVolume2 < maxVolume && cargoWeight2 > minWeight && cargoWeight2 <= maxWeight}"
    )
    println(
        "Груз весом $cargoWeight3 кг и объемом $cargoVolume3 литров соответствует категории 'Average':" +
                "${cargoVolume3 < maxVolume && cargoWeight3 > minWeight && cargoWeight3 <= maxWeight}"
    )
}