package org.example.lesson_17

fun main() {
    val user = User("login1", "password1")
    println(user.newPassword)
    user.newLogin = "login1111"
    user.newPassword = "dgdg"
    println(user.newPassword)
}

class User(private var login: String, private val password: String) {
    var newPassword = password.replace(Regex("(?=.)."), "*")
        get() = field
        set(value) {
            println("Вы не можете изменить пароль")
        }
    var newLogin = login
        get() = field
        set(value) {
            field = value
            if (value != login) {
                login = value
                println("Логин успешно изменен на $login")
            }else println("У вас такой же логин")
        }
}
