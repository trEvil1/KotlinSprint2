package org.example.lesson_18

fun main() {
    val order = Order(1)
    order.printOrder("веревка")
    order.printOrder(listOf("лопата", "савок"))
}

class Order(val orderNumber: Int) {
    fun printOrder(order: String) {
        println("Заказан товар $order")
    }

    fun printOrder(order: List<String>) {
        println("Заказаны следующие товары $order")
    }
}