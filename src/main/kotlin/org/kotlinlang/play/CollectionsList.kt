package org.kotlinlang.play

fun main(args: Array<String>) {

    addSystemUser(4)
    println("Tot sudoers: ${getSysSudoers().size}")
    getSysSudoers().forEach { i ->
        println("Some useful info on user $i")
    }

    // ?? add method not found
    // getSysSudoers().add(5) <- Error!

    println(getSysSudoers()[0])
    println(getSysSudoers().last())

}

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}