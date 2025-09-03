package org.example.lesson_4
const val quantityOfTables = 13
fun main() {
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9
    println("Доступность стольков на сегодня:${quantityOfTables > reservedTablesToday}" +
            "\nДоступность стольков на завтра:${quantityOfTables > reservedTablesTomorrow}")
}