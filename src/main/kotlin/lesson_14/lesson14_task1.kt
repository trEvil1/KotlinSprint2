package org.example.lesson_14

fun main() {
    val cargoShip = Cargo()
    val linerShip = Liner()
    val iceBreakerShip = IceBreaker()
}

open class Liner(
    open val speed: Int = 10,
    open val cargoVolume: Int = 10,
    open var canBreakIce: Boolean = false,
    open var numberOfPassengers: Int = 200
)

class IceBreaker : Liner(speed = 5, cargoVolume = 5, canBreakIce = true, numberOfPassengers = 50)


class Cargo : Liner(speed = 5, cargoVolume = 30, numberOfPassengers = 50)

