package org.example.lesson_10

private const val CORRECT_LOGIN = "admin1"
private const val CORRECT_PASSWORD = "password123"
private const val TOKEN_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"
fun main() {
    val userData = mutableMapOf(CORRECT_PASSWORD to "", CORRECT_LOGIN to "")
    println("Введите логин")
    val login = readln()
    println("Введите пароль")
    val password = readln()
    val token = generateToken(login, password)
    if (token == null) {
        println("Неудачная авторизация")
    } else {
        userData[CORRECT_LOGIN] = token
        userData[CORRECT_PASSWORD] = token
    }
    if (token in userData.values) {
        cart()
    }
}

fun generateToken(login: String, password: String): String? {
    if (login != CORRECT_LOGIN || password != CORRECT_PASSWORD) {
        return null
    } else
        return buildString {
            repeat(32) {
                append(TOKEN_CHARS.random())
            }
        }
}

fun cart() {
    val cartList = listOf("ноутбук", "телевизор", "собака")
    println(cartList.joinToString(", "))
}