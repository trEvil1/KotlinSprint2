package org.example.lesson_18

fun main() {
    val order = Order(1)
    order.printOrder("веревка", order.orderNumber)
    order.printOrder(listOf("лопата", "савок"), order.orderNumber)
}

class Order(val orderNumber: Int) {
    fun printOrder(order: String, orderNumber: Int) {
        println("Заказан товар $order")
    }

    fun printOrder(order: List<String>, orderNumber: Int) {
        println("Заказаны следующие товары $order")
    }
}