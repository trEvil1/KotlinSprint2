package org.example.lesson_4

fun main() {
    val quantityOfTables = 13
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    println("Доступность стольков на сегодня:${quantityOfTables > reservedTablesToday}" +
            "\nДоступность стольков на завтра:${quantityOfTables > reservedTablesTomorrow}")
}