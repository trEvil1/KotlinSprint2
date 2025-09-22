package org.example.lesson_14

fun main() {
    val chat = Chat()
    chat.addMessage("user1", "treterter")
    chat.addMessage("user52", "LOLOLO")
    chat.addThreadMessage(1, "user2", "4535435435")
    chat.addThreadMessage(1, "user3", "476585")
    chat.addThreadMessage(1, "user4", "453hjgj435")
    chat.addThreadMessage(1, "user5", "45dasaas5435")
    chat.addThreadMessage(2, "user2", "4535435435")
    chat.addThreadMessage(2, "user3", "476585")
    chat.addThreadMessage(2, "user4", "453hjgj435")
    chat.addThreadMessage(2, "user5", "45dasaas5435")

    chat.printChat()
}

class Chat {
    val messagesChild = mutableListOf<ChildMessage>()
    val messages = mutableListOf<Message>()
    var index = 1

    fun addThreadMessage(parentMessageId: Int, author: String, text: String) {
        val message = ChildMessage(parentMessageId, index++, author, text)
        messagesChild.add(message)
    }

    fun addMessage(author: String, text: String) {
        val message = Message(index++, author, text)
        messages.add(message)
    }

    fun printChat() {
        val groupMessages = messagesChild.groupBy { it.parentId }
        for (message in messages) {
            println("${message.authorName} ${message.text}")
            if (groupMessages.containsKey(message.id)) {
                groupMessages[message.id]?.sortedBy { it.id }?.forEach { childMessage ->
                    println("\t${childMessage.authorName}:${childMessage.text}")
                }
            }
        }
    }
}

class ChildMessage(val parentId: Int, id: Int, authorName: String, text: String) : Message(id, authorName, text)

open class Message(val id: Int, val authorName: String, val text: String)
