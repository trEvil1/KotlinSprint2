package org.example.lesson_11

fun main() {
    val forum = Forum()
    forum.createNewUser("Питек")
    forum.createNewUser("Димуля")
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.createNewMessage(1)
    forum.createNewMessage(2)
    forum.createNewMessage(1)
    forum.createNewMessage(2)

    forum.printThread()
}
class Forum(){
    val users = mutableMapOf<Int, User>()
    val messages = mutableMapOf<Int, Message>()
    var authorId = 1
    var messagesId = 1

    fun createNewUser(userName: String){
        val user = User(userName, authorId)
        users[authorId] = user
        authorId+=1
    }

    fun createNewMessage(id: Int){
        if (id in users.keys){
            println("Введите сообщение: ")
            val message = readln()
            messages[messagesId] = Message(message, id)
            messagesId+=1
        }
    }

    fun printThread(){
        for (i in messages){
            println("${users[i.value.userId]?.name}:${i.value.text}")
        }
    }
}


class User(val name: String, val id: Int)

class Message(var text: String, var userId: Int)





















