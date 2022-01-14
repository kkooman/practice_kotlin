package org.coursera.learn.kotlinforjava

fun main() {
    // val f1: () -> Int? = null  // error
    val f2: () -> Int? = { null }
    val f3: (() -> Int)? = null
    // val f4: (() -> Int)? = { null } // error
}