package org.example.lesson_17

fun main() {
    val user = User("login1", "password1")
    println(user.password)
    user.login = "login1111"
    user.password = "dgdg"
    println(user.password)
}

class User(login: String, password: String) {
    var password = password
        get() = "*".repeat(field.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }
    var login = login
        set(value) {
            field = value
            if (value != login) {
                login = value
                println("Логин успешно изменен на $value")
            } else println("У вас такой же логин")
        }
}
