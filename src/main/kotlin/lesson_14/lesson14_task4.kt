package org.example.lesson_14

fun main() {
    val planet = Planet()
    planet.name = "Земля"
    planet.satellitesName?.add("луна")
    planet.satellitesName?.add("не луна")
    println("${planet.name} ${planet.satellitesName?.joinToString(", ") } ")
}
open class CelestialBody(
    var name: String ,
    var satellitesName: MutableList<String>? = null,
    var atmosphere: Boolean = true,
    var landing: Boolean = true,
)

class Planet() : CelestialBody("", satellitesName = mutableListOf()) {

}

class Satellite() : CelestialBody("") {

}
