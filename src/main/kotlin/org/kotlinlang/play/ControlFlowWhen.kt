package org.kotlinlang.play


fun main(args: Array<String>) {

    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")

    println("---------------------")

    intCases(1)
    intCases(2)
    intCases(3)

    println("---------------------")

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}


fun cases(obj: Any) {
    when (obj) {
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

fun intCases(obj: Int) {
    when (obj) {
        1 -> println("One")
        2 -> println("Two")
        else -> println("Other number : $obj")
    }
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass