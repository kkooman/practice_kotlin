package org.kotlinlang.play

fun main(args: Array<String>) {

    val customer = Customer()

    val contact = Contact(99, "ethanX@gmail.com")
    println(contact.id)
    contact.email = "ethanY@gmail.com"
    /*
        No value passed for parameter 'email'
        No value passed for parameter 'id'
    */
    // val contact2 = Contact();
}

class Customer
class Contact(val id: Int, var email: String)

