package org.coursera.learn.kotlinforjava

fun main(args: Array<String>) {
    println("abcd".extensionLastChar())


    println("a".repeat(9))
    // in java
    // StringUtilKt.repeat("", 9);
}

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}


fun String.extensionLastChar() = get(this.length - 1)


