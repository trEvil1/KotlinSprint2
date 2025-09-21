package org.example.lesson_15

fun main() {
    val carp = Carp("Карась")
    val duck = Duck("Утка")
    val seagull = Seagull("Чайка")
    carp.swim()
    duck.swim()
    duck.fly()
    seagull.fly()
}

interface FlyingCreature {
    fun fly()
}

interface SwimmingCreature {
    fun swim()
}

class Duck(val name: String) : FlyingCreature, SwimmingCreature {
    override fun fly() {
        println("$name летает")
    }

    override fun swim() {
        println("$name плавает")
    }
}

class Seagull(val name: String) : FlyingCreature {
    override fun fly() {
        println("$name летает")
    }
}

class Carp(val name: String) : SwimmingCreature {
    override fun swim() {
        println("$name плавает")
    }
}