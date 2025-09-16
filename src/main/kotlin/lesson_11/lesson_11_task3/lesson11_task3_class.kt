package org.example.lesson_11.lesson_11_task3

fun main() {
    val status1 = Status("Пользователь заглушен")
    val status2 = Status("Микрофон выключен")
    val status3 = Status("Пользователь разговаривает")
    val roomPicture = Picture("c://room.png")
    val avatarPicture = Picture("c://avatar.png")

    val user1 = User("User1", status1, avatarPicture)
    val user2 = User("User2", status2, avatarPicture)

    val room = Room(roomPicture, "Дискорд", mutableListOf(user2, user1))
    room.printAllUsers()

    val user3 = User("User3", status3, avatarPicture)
    room.addUser(user3)
    room.printAllUsers()

    room.updateStatus("User3", status1)
    room.printAllUsers()
}

class Room(val picture: Picture, val name: String, val userList: MutableList<User>) {
    fun addUser(newUser: User) {
        userList.add(newUser)
    }

    fun updateStatus(userName: String, newStatus: Status) {
        for (user in userList) {
            if (user.name == userName) {
                user.status = newStatus
            }
        }
    }

    fun printAllUsers() {
        for (user in userList) {
            println("${user.name} ${user.status.statusName}")
        }
        println("")
    }
}

class User(val name: String, var status: Status, val avatar: Picture)

class Status(val statusName: String)

class Picture(val avatarPath: String)
