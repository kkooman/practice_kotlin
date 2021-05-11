package org.kotlinlang.play


fun main(args: Array<String>) {
    for (i in 0..3) {
        print(i)
    }
    print(" ")

    for (i in 0 until 3) {
        print(i)
    }
    print(" ")

    for (i in 2..8 step 2) {
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    print(" ")

    // sStep must be positive, was: -2.
    // checkStepIsPositive(step > 0, step)
    /*
    for (i in 8..2 step -2) {
        print(i)
    }
    */
    print(" ")

    // abcd
    for (c in 'a'..'d') {
        print(c)
    }
    for (c in 'a'..'d') {
        println("${c.uppercase()} is ${c.code}")
    }

    print(" ")
    // zxvt
    for (c in 'z' downTo 's' step 2) {
        print(c)
    }

    println()
    val x = 6
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()
    if (x in 6..10) {
        print("x is in range from 6 to 10")
    }
    println()
    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }
}