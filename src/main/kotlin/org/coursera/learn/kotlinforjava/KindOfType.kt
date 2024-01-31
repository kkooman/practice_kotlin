package org.coursera.learn.kotlinforjava

data class User(val name: String)

fun main() {


    var user: Nothing? = null
    // user = User("ethan")

    var userEthan: User? = null
    userEthan = User("ethan")

    var userWe: User?
    userWe = User("ethan")

    var userNull: User
}