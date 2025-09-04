package org.example.lesson_5


const val AGE_OF_MAJORITY = 18
fun main() {
    val currentYear = 2025
    val enteredYear = 2000
    val resultText = if (currentYear - enteredYear >= AGE_OF_MAJORITY) {
        "Show special content"
    } else if (currentYear - enteredYear == 16 || currentYear - enteredYear == 17) {
        "Show limited content"
    } else {
        "Back to main screen"
    }
    println(resultText)
}
