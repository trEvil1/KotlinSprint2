package org.example.lesson_11.lesson_11_task2


fun main() {
    val userInfo: User2 = User2("4325612","admin1", "pass", "lol@gmail.com")
    userInfo.passwordChange()
    userInfo.printUserInfo()

}

class User2(val id: String, val login: String, var password: String, val email: String, var bio: String? = null) {

    fun passwordChange() {
        println("Введите пароль")
        val enterPassword = readln()
        if (enterPassword == password) {
            println("Введите новый пароль")
            val newPassword = readln()
            password = newPassword
            println("Пароль изменен")
            setBio()
        } else {
            println("Пароли не совпадают")
            return
        }
    }

    fun printUserInfo() {
        println("$login $password $email $bio $id")
    }

    fun setBio() {
        println("Введите информацию о пользователе")
        val writeBio = readln()
        bio = writeBio
    }
}
