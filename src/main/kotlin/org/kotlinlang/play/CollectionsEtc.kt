package org.kotlinlang.play

fun main(args: Array<String>) {
    // zip
    val A = listOf("a", "b", "c")
    val B = listOf(1, 2, 3, 4)
    val resultPairs = A zip B // [(a, 1), (b, 2), (c, 3)]
    val resultReduce = A.zip(B) { a, b -> "$a$b" } // [a1, b2, c3]

    println(resultPairs)
    println(resultReduce)

    // getOrElse List
    val list = listOf(0, 10, 20)
    println(list.getOrElse(1) { 42 }) // 10
    println(list.getOrElse(10) { 42 }) // 42

    // getOrElse Map[
    val map = mutableMapOf<String, Int?>()
    println(map.getOrElse("x") { 99 }) // 99

    map["x"] = 3
    println(map.getOrElse("x") { 1 }) // 3

    map["x"] = null
    println(map.getOrElse("x") { 1 }) // 1
}

