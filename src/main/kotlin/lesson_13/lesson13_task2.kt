package org.example.lesson_13


fun main() {
    val directory = Directory1("user1", 89123456789, )
    directory.print()
}

class Directory1 (val name:String, val phoneNumber:Long, var company:String? = null,){

    fun print(){
        if (company == null) company="<не указано>"
        println("$name $phoneNumber $company")
    }
}