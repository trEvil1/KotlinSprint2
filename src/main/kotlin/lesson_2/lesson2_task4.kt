package org.example.lesson_2

fun main() {
    val ironOre = 11
    val crystalOre = 7
    println(
        "Добыто железной руды: $ironOre" +
                "\nДобыто кристаллической руды: $crystalOre"
    )

    val buff = 0.2
    val bonusIronOre = ironOre * buff
    val bonusCrystalOre = crystalOre * buff

    println(
        "Добыто бонусной железной руды: ${bonusIronOre.toInt()}" +
                "\nДобыто бонусной кристаллической руды: ${bonusCrystalOre.toInt()}"
    )
}