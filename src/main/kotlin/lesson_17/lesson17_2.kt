package org.example.lesson_17

fun main() {
    val ship = Ship("ship", 1, "55555")

    ship.shipName = "5435345"
    println(ship.shipName)
}

class Ship(private val name: String, val speed: Int, val port: String) {
    var shipName = name
        set(value: String) {
            field = value
            if (name != value) {
                println("Нельзя менять имя корабля")
                shipName = name
            }
        }
}