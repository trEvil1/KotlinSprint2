package org.example.lesson_18

fun main() {

    val fox = Fox()
    val dog = Dog()
    val cat = Cat()
    val animals = listOf<Animal>(fox, dog, cat)
    animals.forEach { it.eat() }
}

abstract class Animal(val name: String, val isSleep: Boolean) {
    abstract fun eat()
    fun sleep() {
        if (isSleep) {
            println("$name -> спит")
        } else println("$name -> не спит")
    }
}

class Fox(val food: String = "ягода") : Animal("Лиса", true) {
    override fun eat() {
        println("$name -> ест ягоды}")
    }
}

class Cat(val food: String = "рыба") : Animal("Кошка", true) {
    override fun eat() {
        println("$name -> ест рыбу}")
    }
}

class Dog(val food: String = "кость") : Animal("Собака", true) {
    override fun eat() {
        println("$name -> ест кости}")
    }
}