package org.example.lesson_11

fun main() {
    val forum = Forum()
    forum.createNewUser("Питек")
    forum.createNewUser("Димуля")
    forum.createNewMessage(1," 434")
    forum.createNewMessage(2,"ghfhfgh")
    forum.createNewMessage(1,"5456")
    forum.createNewMessage(2,"gfdgdf")
    forum.createNewMessage(1," 54354353")
    forum.createNewMessage(2,"dfdfg")

    forum.printThread()
}

class Forum {
    val users = mutableMapOf<Int, User>()
    val messages = mutableMapOf<Int, Message>()
    var authorId = 1
    var messagesId = 1

    fun createNewUser(userName: String):User {
        val user = User(userName, authorId)
        users[authorId] = user
        authorId += 1
        return user
    }

    fun createNewMessage(id: Int, message: String) {
        if (id in users.keys) {
            messages[messagesId] = Message(message, id)
            messagesId += 1
        }
    }

    fun printThread() {
        for (i in messages) {
            println("${users[i.value.userId]?.name}:${i.value.text}")
        }
    }
}

class User(val name: String, val id: Int)

class Message(var text: String, var userId: Int)