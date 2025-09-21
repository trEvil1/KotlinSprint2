package org.example.lesson_15

fun main() {
    val accessories = Accessories("", 0)
    val musicalTool = MusicalTool("", 0, accessories)
    val string = Accessories("Струна", 500)
    val guitar = MusicalTool("Гитара", 2, string)
    val sticks = Accessories("Барабанные палочки", 30)
    val drums = MusicalTool("Барабан", 10, sticks)


    guitar.search(guitar.productName)
    sticks.search(sticks.productName)
}

interface Product {
    val productName: String
    val productQuantity: Int
    fun search(productName: String)
}

class MusicalTool(override val productName: String, override val productQuantity: Int, val accessories: Accessories) :
    Product {
    override fun search(productName: String) {
        if (productName in this.productName) {
            println("Выполняется поиск...")
            println("Найдено $productName в количестве $productQuantity")
        } else println("Такого музыкально инструмента нету")
    }

}

class Accessories(override val productName: String, override val productQuantity: Int) :
    Product {
    override fun search(productName: String) {
        if (productName == this.productName) {
            println("Выполняется поиск...")
            println("Найдено $productName в количестве $productQuantity")
        } else println("Такого аксессуара нету")
    }
}