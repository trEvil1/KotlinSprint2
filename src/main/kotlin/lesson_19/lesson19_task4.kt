package org.example.lesson_19

fun main() {
    val tank = Tank(Bullets.BLUE)
    tank.shot()
    tank.changeBullet(Bullets.RED)
    tank.shot()

}

enum class Bullets(val color: String) {
    BLUE("синий"),
    GREEN("зеленый"),
    RED("красный")
}

class Tank(var bullet: Bullets, private var damage: Int = 0) {
    fun changeBullet(newBullets: Bullets) {
        bullet = newBullets
        println("Вы зарядили ${bullet.color} боеприпас")
    }

    fun shot() {
        if (bullet == Bullets.BLUE) {
            damage = 5
            println("Выстрел ${bullet.color} боеприпасом, вы нанесли $damage урона")
        } else if (bullet == Bullets.GREEN) {
            damage = 10
            println("Выстрел ${bullet.color} боеприпасом, вы нанесли $damage урона")
        } else {
            damage = 20
            println("Выстрел ${bullet.color} боеприпасом, вы нанесли $damage урона")
        }
    }
}