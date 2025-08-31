package org.example.lesson_3

fun main() {
    val greetingsDay = "Добрый день "
    val greetingsEvening = "Добрый вечер "
    val userName = "Кирилл"
    var greetings = greetingsEvening + userName
    println(greetings)
    greetings = greetingsDay + userName
    println(greetings)

}