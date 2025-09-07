package org.example.lesson_5

fun main() {
    println("Введите дистанцию поездки:")
    val travelDistance = readln().toDouble()
    println("Введите расход топлива на 100 километров в литрах:")
    val fuelFlow = readln().toDouble()
    println("Введите цену топлива за литр:")
    val fuelPrice = readln().toDouble()
    val fuelForTravel = (travelDistance * fuelFlow) / 100
    val totalFuelPrice = fuelPrice * fuelForTravel
    println(
        "Количество топлива для поездки: ${"%.2f".format(fuelForTravel)}" +
                "\nИтоговая стоимость поездки: ${"%.2f".format(totalFuelPrice)}"
    )


}