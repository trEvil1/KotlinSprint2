package org.example.lesson_22

fun main() {
    val regularBook = RegularBook("123", "user")
    val dataBook = DataBook("123", "user")
    println(regularBook.name == dataBook.name)
    println(regularBook.author == dataBook.author)//тут мы сравнимаем свойства и указываем их и они идентичны
    println(regularBook == dataBook)// тут сравниваются строки вывода самих объектов и у regularBook это непонятная строка а у DataBook это понятный строковый вывод объектов
}

class RegularBook(val name: String, val author: String)

data class DataBook(val name: String, val author: String)