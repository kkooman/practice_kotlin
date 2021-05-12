package org.kotlinlang.play

fun main(args: Array<String>) {

    val numbers = listOf(1, -2, 3, -4, 5, -6)

    println("----------------------------------------")
    val positives = numbers.filter { x -> x > 0 }
    println(positives)

    val negatives = numbers.filter { it < 0 }
    println(negatives)

    println("----------------------------------------")
    val doubled = numbers.map { x -> x * 2 }
    println(doubled)
    val tripled = numbers.map { it * 3 }
    println(tripled)

    println("----------------------------------------")
    // Function any, if the collection contains at least one element
    val anyNegative = numbers.any { it < 0 }
    println(anyNegative) // true
    val anyGT6 = numbers.any { it > 6 }
    println(anyGT6) // false

    // Function all, if all elements
    val allEven = numbers.all { it % 2 == 0 }
    println(allEven) // false
    val allLess6 = numbers.all { it < 6 }
    println(allLess6) // true

    // Function none, if there are no elements
    val allEvenNone = numbers.none { it % 2 == 1 }
    println(allEvenNone) // false
    val allLess6None = numbers.none { it > 6 }
    println(allLess6None) // true

    println("----------------------------------------")
    // find
    val words = listOf("Lets", "find", "something", "in", "collection", "somehow")
    val first = words.find { it.startsWith("some") }
    println(first) // something
    val last = words.findLast { it.startsWith("some") }
    println(last) // somehow
    val nothing = words.find { it.contains("nothing") }
    println(nothing) // null

    // first, last
    println(words.first { it.length < 5 }) // Lets
    //println(words.filter { it.length < 5 }.first()) // Lets, merge call chain
    println(words.last()) // somehow


    // firstOrNull, lastOrNull
    val empty = emptyList<String>()
    val first2 = empty.firstOrNull()
    println(first2) // null
    val last2 = empty.lastOrNull()
    println(last2) // null

    val firstF = words.firstOrNull { it.startsWith('f') }
    println(firstF) // find
    val firstZ = words.firstOrNull { it.startsWith('z') }
    println(firstZ) // null
    val lastF = words.lastOrNull { it.endsWith('f') }
    println(lastF) // null
    val lastZ = words.lastOrNull { it.endsWith('z') }
    println(lastZ) // null

    // count
    val totalCount = numbers.count()
    val evenCount = numbers.count { it % 2 == 0 }
}
