package org.example.lesson_11

fun main() {
    val forum = Forum(User(), User(), User(), 0)
    forum.createNewUser("user1")
    forum.createNewUser("user2")
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.printThread(forum.users.names, forum.userMessage.message)
}

class Forum(var userId: User, var users: User, var userMessage: User, var index: Int) {
    fun createNewUser(user: String): String {
        index += 1
        userId.ID = index
        users.names.put(userId.ID, user)
        return user
    }

    fun createNewMessage(id: Int) {
        if (id in users.names.keys) {
            println("Введите сообщение")
            val newMessage = readln()
            userMessage.message.put(id, newMessage)
        } else return
    }

    fun printThread(user: Map<Int, String>, userMessage: Map<Int, String>) {
        for (i in user.keys) {
            println("${user.get(i)}: ${userMessage.get(i)}")
        }
    }
}

class User() {
    var names = mutableMapOf<Int, String>()
    var ID = 1
    var message = mutableMapOf<Int, String>()
}