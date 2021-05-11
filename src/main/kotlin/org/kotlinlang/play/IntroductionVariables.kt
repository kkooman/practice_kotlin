package org.kotlinlang.play

fun main(args: Array<String>) {
    var a: String = "initial"
    println(a)
    val b: Int = 1
    val c = 3

    // case 1
    var e: Int
    // Variable 'e' must be initialized.
    // println(e)

    // case 2
    val d: Int
    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }
    println(d)
}

fun someCondition(): Boolean {
    return false
}