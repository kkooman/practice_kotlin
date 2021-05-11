package org.kotlinlang.play

class Customer
class Contact(val id: Int, var email: String)

fun main() {

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