package org.example.lesson_14

fun main() {
    val cargoShip = Cargo1("Грузовой","грузовой корабль активирует погрузочный кран")
    val linerShip = Liner1("Лайнер", "выдвигает горизонтальный трап со шкафута")
    val iceBreakerShip = IceBreaker1("Ледокол", "ледокол открывает ворота со стороны кормы")
    cargoShip.printShip(cargoShip)
    linerShip.printShip(linerShip)
    iceBreakerShip.printShip(iceBreakerShip)
}

open class Ship(
    val name: String,
    var speed: Int = 10,
    var cargoVolume: Int = 10,
    var breakIce: Boolean = false,
    var numberOfPassengers: Int = 50,
    var loadingType: String
) {
    fun printShip(ship: Ship) {
        println(
            "${ship.name} ${ship.speed} скорость, " +
                    "${ship.cargoVolume} объем груза, " +
                    "${ship.breakIce} возможность ломать лед, " +
                    "${ship.numberOfPassengers} количество пассажиров, " +
                    "${ship.loadingType} "
        )
    }
}


class IceBreaker1(name: String, loading: String) :
    Ship(name, loadingType = loading, speed = 5, cargoVolume = 5, breakIce = true) {
}

class Liner1(name: String, loading: String) :
    Ship(name, numberOfPassengers = 200, loadingType = loading) {
}

class Cargo1(name: String, loading: String) :
    Ship(name, speed = 5, cargoVolume = 30, loadingType = loading) {
}