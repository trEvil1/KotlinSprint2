package org.example.lesson_13


fun main() {
    var contact = Directory3("", null, null)
    val contactList = mutableListOf<Directory3>()
    println("Хотите добавить контакт? Да/нет")
    var answer = readln()
    while (answer == "Да".decapitalize())  {
        println("Введите имя")
        val contactName = readln()
        println("Введите номер телефона")
        val contactPhoneNumber = readln().toLongOrNull()
        println("Введите компанию")
        val contactCompany = readln()
        if (contactPhoneNumber == null) {
            println("Вы не ввели номер телефона")
            return
        }
        contact = Directory3(contactName, contactPhoneNumber, contactCompany)
        contactList.add(contact)
        println("Хотите добавить еще контакт? Да/Нет")
        answer = readln()
    }
    contact.printContacts(contactList)
}

class Directory3(val name: String, val phoneNumber: Long?, var company: String? = null) {

    fun printContacts(contactsList: MutableList<Directory3>) {
        contactsList.map { println("${it.name} ${it.phoneNumber} ${it.company}") }
    }
}