package org.example.lesson_16

fun main() {
    val order = Order(1, "Готовится")
    println("Заказ номер ${order.orderNumber} ${order.newStatus("Готово")}")
}

class Order(val orderNumber: Int, private var status: String) {
    fun newStatus(newStatus: String): String {
        status = callManager(newStatus)
        return status
    }
}

fun callManager(newStatus: String): String {
    return newStatus
}