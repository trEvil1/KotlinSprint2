package org.example.lesson_2

fun main() {
    val ironOre = 11
    val crystalOre = 7
    println(
        "Добыто железной руды: $ironOre" +
                "\nДобыто кристаллической руды: $crystalOre"
    )

    val buff = 20
    val percent = 100.0
    val bonusIronOre  = ironOre / percent * buff
    val bonusCrystalOre = crystalOre / percent * buff

    println(
        "Добыто бонусной железной руды: ${bonusIronOre.toInt()}" +
                "\nДобыто бонусной кристаллической руды: ${bonusCrystalOre.toInt()}"
    )
}