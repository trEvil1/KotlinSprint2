package org.example.lesson_5

fun main() {
    val enteredNumber1 = readln().toInt()
    val enteredNumber2 = readln().toInt()
    val enteredNumber3 = readln().toInt()
    val listOfEnteredNumbers = listOf(enteredNumber1,enteredNumber2,enteredNumber3)
    val winNumber1 = (0..42).random()
    val winNumber2 = (0..42).random()
    val winNumber3 = (0..42).random()
    val listOfWinningNumber = listOf(winNumber1,winNumber2,winNumber3)
    val quantityOfNumbers = listOfWinningNumber.intersect(listOfEnteredNumbers).size
    if (quantityOfNumbers == 3){
        println("Поздравляю вы выйграли джекпот")
    }else if (quantityOfNumbers == 2){
        println("Поздравляю вы выйграли крупный выйгрыш")
    }else if (quantityOfNumbers == 1){
        println("Поздравляю вы выйграли утешительный приз")
    }else{
        println("Вы не угадали ни одного числа")
    }
    println("Загаданные числа: $listOfWinningNumber")
}