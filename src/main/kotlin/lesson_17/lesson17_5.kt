package org.example.lesson_17

fun main() {
    val user = User("login1", "password1")
    println(user.newPassword)
    user.newLogin = "login1111"
    user.newPassword = "dgdg"
    println(user.newPassword)
}

class User(private var login: String, password: String) {
    var newPassword = password
        get() = field.replace(Regex("(?=.)."), "*")
        set(value) {
            println("Вы не можете изменить пароль")
            field = value
        }
    var newLogin = login
        get() = field
        set(value) {
            field = value
            if (value != login) {
                login = value
                println("Логин успешно изменен на $login")
            } else println("У вас такой же логин")
        }
}
