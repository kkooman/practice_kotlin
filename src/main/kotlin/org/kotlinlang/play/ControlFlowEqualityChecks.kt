package org.kotlinlang.play

fun main(args: Array<String>) {

    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers) // ignore element order, authors.equals(writers)
    println(authors === writers) // distinct references
}