package org.example.lesson_18

fun main() {
    val order = Order()
    order.getOrder("веревка",1)
    order.getOrder(listOf("лопата", "савок"),2)
}
class Order(){
    fun getOrder(order: String, orderNumber:Int){
        println("Номер заказа $orderNumber заказ: $order")
    }
    fun getOrder(order: List<String>, orderNumber:Int){
        println("Номер заказа $orderNumber заказ: $order")
    }

}