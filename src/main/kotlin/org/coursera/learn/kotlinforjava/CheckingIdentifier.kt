package org.coursera.learn.kotlinforjava

fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}


fun isValidIdentifier(s: String): Boolean {
    if (s.isBlank()) {
        return false
    }
    if (s[0].isDigit()) {
        return false
    }
    if (s.filter { it.isLetterOrDigit() or (it == '_') } != s) {
        return false
    }
    return true
}