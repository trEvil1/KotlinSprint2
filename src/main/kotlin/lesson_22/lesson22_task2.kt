package org.example.lesson_22

fun main() {
    val regularBook = RegularBook("123", "user")
    val dataBook = DataBook("123", "user")
    println(dataBook.equals(regularBook))//выдает false т.к. println применяет метод .toString() к каждому объекту и dataBook выдает свои свойства в виде строки а regularBook нет
}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)