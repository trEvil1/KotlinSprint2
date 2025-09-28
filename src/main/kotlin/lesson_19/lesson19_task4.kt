package org.example.lesson_19

fun main() {
    val tank = Tank()
    tank.shot()
    tank.changeBullet(Bullets.RED)
    tank.shot()

}

enum class Bullets(val color: String, val damage: Int) {
    BLUE("синий", 5),
    GREEN("зеленый", 10),
    RED("красный", 20)
}

class Tank(var bullet: Bullets? = null, var damage: Int = 0) {
    fun changeBullet(newBullets: Bullets) {
        bullet = newBullets
        println("Вы зарядили ${bullet?.color} боеприпас")
    }

    fun shot() {
        if (bullet == Bullets.BLUE) {
            damage = Bullets.BLUE.damage
            println("Выстрел ${bullet?.color} боеприпасом, вы нанесли $damage урона")
        } else if (bullet == Bullets.GREEN) {
            damage = Bullets.GREEN.damage
            println("Выстрел ${bullet?.color} боеприпасом, вы нанесли $damage урона")
        } else {
            damage = Bullets.RED.damage
            println("Выстрел ${bullet?.color} боеприпасом, вы нанесли $damage урона")
        }
    }
}