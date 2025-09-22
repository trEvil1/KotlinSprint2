package org.example.lesson_14

fun main() {
    val planet = Planet("Земля", true, true)
    val moon = Satellite("Луна", false, true)
    val notMoon = Satellite("не Луна", false, false)
    planet.satellitesName.add(moon)
    planet.satellitesName.add(notMoon)
    println("${planet.name} ${planet.satellitesName.map { it.name }.joinToString(", ")} ")
}

open class CelestialBody(
    val name: String,
    val satellitesName: MutableList<Satellite> = mutableListOf(),
    val hasAtmosphere: Boolean = true,
    val canLanding: Boolean = true,
)

class Planet(name: String, hasAtmosphere: Boolean, canLanding: Boolean) :
    CelestialBody(name, satellitesName = mutableListOf(), hasAtmosphere = hasAtmosphere, canLanding = canLanding) {

}

class Satellite(name: String, hasAtmosphere: Boolean, canLanding: Boolean) :
    CelestialBody(name, hasAtmosphere = hasAtmosphere, canLanding = canLanding) {

}
