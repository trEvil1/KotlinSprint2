package org.example.lesson_17

fun main() {
    val player = QuizItem("Вопрос", "Ответ")
    println(player.question)
    println(player.answer)
}

class QuizItem(question: String, answer: String) {
    var question: String = question
        get() = field

    var answer: String = answer
        get() = field
        set(value) {
            field = value
        }
}