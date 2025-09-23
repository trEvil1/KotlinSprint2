package org.example.lesson_17

fun main() {
    val pack = Package(1, "Москва")
    pack.newPlace = "Самара"
    pack.newPlace = "Волгоград"
    println("${pack.index} ${pack.packageNumber} ${pack.newPlace} ")
}

class Package(private val number: Int, private var place: String, var index: Int = 0) {
    var packageNumber = number
    var newPlace = place
        get() = field
        set(value: String) {
            field = value
            if (field != place) {
                index += 1
            }
        }
}
