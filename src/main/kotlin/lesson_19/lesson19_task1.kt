package org.example.lesson_19

fun main() {
    println(
        "Вы можете добавить в аквариум:${Fishes.GUPPY.fish}," +
                " ${Fishes.GOLDFISH.fish}, " +
                "${Fishes.ANGELFISH.fish}, " +
                Fishes.SIAMESE_FIGHTING_FISH.fish
    )
}

enum class Fishes(val fish: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалария"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("рыбка петушок")
}