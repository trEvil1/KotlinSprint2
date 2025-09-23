package org.example.lesson_18

fun main() {

    val fox = Fox(isSleep = false)
    val dog = Dog(isSleep = false)
    val cat = Cat(isSleep = false)
    val animals = listOf<Action>(fox, dog, cat)
    println(animals.forEach { it.actionFeed() })
}
interface Action {
    fun actionFeed()
    fun actionSleep()
}

class Fox(val name: String = "Лиса", val food: String = "ягода", val isSleep: Boolean) : Action {
    override fun actionFeed() {
        println("$name -> $food")
    }

    override fun actionSleep() {
    }
}

class Cat(val name: String = "Кошка", val food: String = "рыба", val isSleep: Boolean) : Action {
    override fun actionFeed() {
        println("$name -> $food")
    }

    override fun actionSleep() {
    }
}

class Dog(val name: String = "Собака", val food: String = "кость", val isSleep: Boolean) : Action {
    override fun actionFeed() {
        println("$name -> $food")
    }

    override fun actionSleep() {
    }
}