package org.example.lesson_14

fun main() {
    val cargoShip = Cargo1("Грузовой")
    val linerShip = Liner1()
    val iceBreakerShip = IceBreaker1("Ледокол")
    cargoShip.printShip()
    linerShip.printShip()
    iceBreakerShip.printShip()
}

open class Liner1(
    val name: String = "Лайнер",
    val speed: Int = 10,
    val cargoVolume: Int = 10,
    val breakIce: Boolean = false,
    val numberOfPassengers: Int = 200,
    val loadingType: String = "выдвигает горизонтальный трап со шкафута"
) {
    fun printShip() {
        println(
            "${this.name} ${this.speed} скорость, " +
                    "${this.cargoVolume} объем груза, " +
                    "${this.breakIce} возможность ломать лед, " +
                    "${this.numberOfPassengers} количество пассажиров, " +
                    "${this.loadingType} "
        )
    }
}

class IceBreaker1(name: String, loading: String = "ледокол открывает ворота со стороны кормы") :
    Liner1(name, loadingType = loading, speed = 5, cargoVolume = 5, breakIce = true) {
}

class Cargo1(name: String, loading: String = "грузовой корабль активирует погрузочный кран") :
    Liner1(name, speed = 5, cargoVolume = 30, loadingType = loading) {
}