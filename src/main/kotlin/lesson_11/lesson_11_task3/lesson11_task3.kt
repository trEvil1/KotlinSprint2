package org.example.lesson_11.lesson_11_task3

fun main() {
    val room = Room("RoomName", "", "")
    room.addUser()
    room.replaceStatus()
    println("${room.roomName} ${room.userList} ${room.status}")
}