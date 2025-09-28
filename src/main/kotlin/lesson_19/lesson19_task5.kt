package org.example.lesson_19

fun main() {
    val cardFile = mutableListOf<Person>()
    while (cardFile.lastIndex < 4) {
        println("Введите имя")
        val name = readln()
        println("Введите пол мужчина/женщина")
        val gender = readln()
        if ((gender).lowercase() == Gender.MALE.name) {
            val person = Person(name, Gender.MALE)
            cardFile.add(person)
        } else {
            val person = Person(name, Gender.FEMALE)
            cardFile.add(person)
        }
    }
    cardFile.map { println("${it.name} ${it.gender.gen}") }
}

enum class Gender(val gen: String) {
    MALE("мужчина"),
    FEMALE("женщина")
}

class Person(val name: String, val gender: Gender)

