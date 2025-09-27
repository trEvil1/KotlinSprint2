package org.example.lesson_20

fun main() {
    val player = Player("player1", 10)
    val heal = fun(player: Player) = player.maxHp
    player.currentHp = heal(player)
    println("${player.name} ${player.currentHp}")

}

class Player(val name: String, var currentHp: Int, val maxHp: Int = 100)