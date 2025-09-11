package org.example.lesson_8

fun main() {
    val day1 = 100
    val day2 = 300
    val day3 = 433
    val day4 = 3213
    val day5 = 545
    val day6 = 843
    val day7 = 750
    val arrayOfViews = intArrayOf(day7, day6, day5, day4, day3, day2, day1)
    var allViews = 0
    for (i in arrayOfViews) {
        allViews += i
    }
    println(allViews)
}