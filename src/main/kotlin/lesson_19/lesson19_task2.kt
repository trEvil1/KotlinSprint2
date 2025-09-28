package org.example.lesson_19

fun main() {
    val product1 = Product("Шуба",1, ProductsCategory.CLOTHES)
    val product2 = Product("Ручка",2, ProductsCategory.STATIONARY)
    val product3 = Product("Мяч",3, ProductsCategory.DIFFERENT)
    product3.printProduct()
    product2.printProduct()
    product1.printProduct()
}

enum class ProductsCategory() {
    CLOTHES {
        override fun product(): String {
            return "одежда"
        }
    },

    STATIONARY {
        override fun product(): String {
            return "канцтовары"
        }
    },
    DIFFERENT {
        override fun product(): String {
            return "разное"
        }
    };

    abstract fun product(): String
}

class Product(val name: String, val id: Int, val products: ProductsCategory) {
    fun printProduct() {
        println("$name $id ${products.product()}")
    }
}