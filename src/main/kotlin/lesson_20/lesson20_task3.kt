package org.example.lesson_20

fun main() {
    val player = Player("player", false)
    val openDoor: (Player) -> Unit = fun(player: Player) {
        if (player.haveKey == true) {
            println("Игрок открыл дверь")
        } else println("Дверь заперта")
    }
    openDoor(player)
}


class Player(val name: String, val haveKey: Boolean)