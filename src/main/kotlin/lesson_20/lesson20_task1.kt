package org.example.lesson_20

fun main() {
    val helloLambda = {username:String ->
        println("С наступающим Новым Годом, $username!")
    }("user1")
    return helloLambda
}