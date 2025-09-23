package org.example.lesson_17

fun main() {
    val player = Player("Вопрос", "Ответ")
    println(player.question)
    println(player.answer)
}

class Player(val newQuestion: String, val newAnswer: String) {
    var question = newQuestion
        get() = field

    var answer = newAnswer
        get() = field
        set(value: String) {
            field = value
        }
}