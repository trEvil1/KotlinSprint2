package org.example.lesson_16

fun main() {
    val player = Player("player", 100, 5)
    player.takeDamage(5)
    player.heal(5)
    player.takeDamage(30)
    player.takeDamage(30)
    player.takeDamage(30)
    player.takeDamage(30)
    player.heal(5)
}

class Player(val name: String, private var hp: Int, private var power: Int) {
    private fun die() {
        power = 0
        hp = 0
        println("$name умер")
    }


    fun takeDamage(damage: Int) {
        if (hp > 0) {
            hp -= damage
            if (hp <= 0) {
                die()
                return
            }
            println("Вы получили $damage урона ваше текущее здоровье $hp")
        }
    }

    fun heal(hpBoost: Int) {
        if (hp > 0) {
            hp += hpBoost
            println("Вы исцелились на $hpBoost теперь ваше здоровье $hp")
        } else println("Вы не можете исцелиться когда мертвы")
    }
}