package org.example.lesson_17

fun main() {
    val folder = Folder("folder1", 100, false)
    println("${folder.folderName} ${folder.files}")
}

class Folder(private val name: String, private val filesCount: Int, private val isSecret: Boolean) {
    val folderName = name
        get() = if (isSecret) field else "скрытая папка"
    val files = filesCount
        get() = if (isSecret) field else 0
}