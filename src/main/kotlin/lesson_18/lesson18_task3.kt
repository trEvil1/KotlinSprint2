package org.example.lesson_18

fun main() {

    val fox = Fox(isSleep = false)
    val dog = Dog(isSleep = false)
    val cat = Cat(isSleep = false)
    val animals = listOf<Action>(fox, dog, cat)
    animals.forEach { it.eat() }
}

abstract class Action() {
    abstract fun eat()
    abstract fun sleep()
}

class Fox(val name: String = "Лиса", val food: String = "ягода", val isSleep: Boolean) : Action() {
    override fun eat() {
        println("$name -> ест ${food.replace('а', 'ы')}")
    }

    override fun sleep() {
    }
}

class Cat(val name: String = "Кошка", val food: String = "рыба", val isSleep: Boolean) : Action() {
    override fun eat() {
        println("$name -> ест ${food.replace('а', 'у')}")
    }

    override fun sleep() {
    }
}

class Dog(val name: String = "Собака", val food: String = "кость", val isSleep: Boolean) : Action() {
    override fun eat() {
        println("$name -> ест ${food.replace('ь', 'и')}")
    }

    override fun sleep() {
    }
}