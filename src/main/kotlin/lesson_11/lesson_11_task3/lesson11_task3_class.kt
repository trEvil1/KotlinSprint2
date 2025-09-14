package org.example.lesson_11.lesson_11_task3


class Room(val roomName: String, var userList: String, var status: String) {

    fun addUser() {
        println("Хотите добавить пользователя? Да/Нет")
        val design = readln()
        if (design == "Да") {
            println("Введите имя пользователя")
            userList = readln()
        } else return
    }

    fun replaceStatus() {
        val status1 = "Разговаривает"
        val status2 = "Микрофон выключен"
        val status3 = "Пользователь заглушен"
        println("Какому пользователю хотите изменить статус?")
        val user = readln()
        if (user == userList) {
            println("Введите статус пользователя 1-$status1, 2-$status2, 3-$status3")
            val newStatus = readln().toInt()
            if (newStatus !in 1..3) {
                println("Неверноче число")
            }
            when (newStatus) {
                1 -> status = status1
                2 -> status = status2
                3 -> status = status3
            }
        } else println("Неверное имя пользователя")
    }
}
