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

class Player(val name: String, var hp: Int, var power: Int) {
    private fun death() {
        if (hp <= 0) {
            power = 0
            println("$name умер")
        }
    }

    fun takeDamage(damage: Int) {
        if (hp > 0) {
            hp -= damage
            if (hp < 0) {
                death()
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