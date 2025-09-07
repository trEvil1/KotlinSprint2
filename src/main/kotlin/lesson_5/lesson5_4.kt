package org.example.lesson_5

const val USER_Name = "Zaphod"
const val USER_PASSWORD = "PanGalactic"
fun main() {

    val enteredName = readln()
    val enteredPassword = readln()
    if (enteredName == USER_Name) {
        println("Введите пароль")
        if (enteredPassword == USER_PASSWORD) {
            println("Добро пожаловать")
        } else {
            println("Неверный пароль")
            return
        }
    } else {
        println("Хотите зарегестрироваться?")
        return
    }

}