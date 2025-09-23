package org.example.lesson_15

fun main() {
    var countPassengers = 0
    var currentCargo = 0
    val car = Car("Туда")
    val truck = Truck("Туда")

    car.loadingPassengers(3)
    countPassengers += car.unloadingPassengers(3)
    car.loadingPassengers(2)
    countPassengers += car.unloadingPassengers(2)
    truck.loadingPassengers(1)
    truck.loadingCargo(2)
    countPassengers += truck.unloadingPassengers(1)
    currentCargo += truck.unloadingCargo(2)
    println("${countPassengers} людей доставлено, ${currentCargo} груза доставлено")
}

interface Passengers {
    val passengersCapacity: Int
    fun unloadingPassengers(count: Int): Int
    fun loadingPassengers(count: Int): Int
}

interface Cargo {
    val cargoVolume: Int
    fun unloadingCargo(count: Int): Int
    fun loadingCargo(count: Int): Int
}

interface Move {
    val currentPlace: String
    fun moveTo(to: String)
}

class Truck(override var currentPlace: String) : Cargo, Passengers, Move {
    override val cargoVolume = 2
    override val passengersCapacity = 1
    var currentCargo = 0
    var currentPassengers = 0
    override fun moveTo(to: String) {
        currentPlace = to
    }

    override fun unloadingCargo(count: Int): Int {
        if (count - currentCargo >= 0) {
            currentCargo -= count
            return count
        } else return 0
    }

    override fun loadingCargo(count: Int): Int {
        if (count + currentPassengers <= cargoVolume && currentCargo + count > 0) {
            currentPassengers += count
            return currentPassengers
        } else return 0
    }

    override fun unloadingPassengers(count: Int): Int {
        if (count - currentPassengers >= 0) {
            currentPassengers -= count
            return count
        } else return 0
    }

    override fun loadingPassengers(count: Int): Int {
        if (count + currentPassengers <= passengersCapacity && count + currentPassengers > 0) {
            currentPassengers += count
            return currentPassengers
        } else return 0
    }
}

class Car(override var currentPlace: String) : Passengers, Move {
    override val passengersCapacity = 3
    var currentPassengers = 0
    override fun moveTo(to: String) {
        currentPlace = to
    }

    override fun unloadingPassengers(count: Int): Int {
        if (count - currentPassengers >= 0) {
            currentPassengers -= count
            return count
        } else return 0
    }

    override fun loadingPassengers(count: Int): Int {
        if (count + currentPassengers <= passengersCapacity && count + currentPassengers > 0) {
            currentPassengers += count
            return currentPassengers
        } else return 0
    }
}

