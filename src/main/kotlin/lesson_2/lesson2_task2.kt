package org.example.lesson_2

fun main() {
    val payEmployee = 30000
    val payIntern = 20000
    val numberOfEmployee = 50
    val numberOfIntern = 30

    val payCostEmployee = payEmployee * numberOfEmployee
    val payCostFull = payCostEmployee + payIntern * numberOfIntern
    val averagePayCost = payCostFull / (numberOfEmployee + numberOfIntern)
    println(
        "Расход на зарплаты сотрудников: $payCostEmployee " +
                "\nРасходы на зарплату сотрудников и стажеров: $payCostFull" +
                "\nСредняя зарплата сотрудника: $averagePayCost "
    )
}

