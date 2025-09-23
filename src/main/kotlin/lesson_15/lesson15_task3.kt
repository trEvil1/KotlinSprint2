package org.example.lesson_15

fun main() {
    val admin = Admin("admin1", "", true)
    val user = User("user1", "", true)
    user.printMessage(user)
    admin.printMessage(admin)
    admin.blockUser(user)
    user.printMessage(user)
}

abstract class AllUsers(var writeMessage: Boolean = true) {
    abstract var message: String
    abstract fun printMessage(message: AllUsers)
}

class User(val name: String, override var message: String, writeMessage: Boolean) : AllUsers(writeMessage) {
    override fun printMessage(message: AllUsers) {
        println("Сообщение:")
        message.message = readln()
        if (writeMessage == true) {
            println(message.message)
        } else println("Вы заблокированы")
    }
}

class Admin(val name: String, override var message: String, writeMessage: Boolean) : AllUsers(writeMessage) {
    override fun printMessage(message: AllUsers) {
        println("Сообщение:")
        message.message = readln()
        println(message.message)
    }

    fun blockUser(user: User) {
        println("Введите имя пользователя для блокировки")
        val userToBlock = readln()
        if (userToBlock in user.name) {
            user.writeMessage = false
            println("${user.name} заблокирован")
        } else println("Такого пользователя нету")
    }
}