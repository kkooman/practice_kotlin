package org.kotlinlang.play

fun main(args: Array<String>) {

    fun max(a: Int, b: Int) = if (a > b) a else b
    fun min(a: Int, b: Int) = if (a < b) {
        a
    } else b

    println(max(99, -42))
    println(max(2, 10))
    println(min(99, -42))
    println(min(2, 10))
}