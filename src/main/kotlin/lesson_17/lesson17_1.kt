package org.example.lesson_17

fun main() {
    val player = QuizItem("Вопрос", "Ответ")
    println(player.question)
    println(player.answer)
}

class QuizItem(val question: String, val answer: String) {
    var quest = this.question
        get() = field

    var reply = this.answer
        get() = field
        set(value) {
            field = value
        }
}