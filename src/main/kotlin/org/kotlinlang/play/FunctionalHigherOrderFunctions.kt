package org.kotlinlang.play

fun main(args: Array<String>) {
    println("--------------------------")
    // Taking Functions as Parameters
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")

    "lambda arguments should be moved out of parentheses"
    val mulResult2 = calculate(4, 5, { a, b -> a * b })
    println("sumResult $sumResult, mulResult2 $mulResult2")

    println("--------------------------")
    // Returning Functions
    val func = operation()
    println(func(2))
}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}
fun sum(x: Int, y: Int) = x + y

fun operation(): (Int) -> Int {
    return ::square
}
fun square(x: Int) = x * x