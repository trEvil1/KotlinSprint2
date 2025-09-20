package org.example.lesson_14

fun main() {
    val cargoShip = Cargo()
    val linerShip = Liner()
    val iceBreakerShip = IceBreaker()
}

open class Ship(
    var speed: Int = 10,
    var cargoVolume: Int = 10,
    var breakIce: Boolean = false,
    var numberOfPassengers: Int = 50
)


class IceBreaker() : Ship(speed = 5, cargoVolume = 5, breakIce = true )

class Liner() : Ship(numberOfPassengers = 200)

class Cargo() : Ship(speed = 5, cargoVolume = 30)

