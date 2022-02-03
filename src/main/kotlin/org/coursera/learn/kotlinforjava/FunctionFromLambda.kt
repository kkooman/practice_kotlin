package org.coursera.learn.kotlinforjava

fun main() {
    fun duplicateNonZero(list: List<Int>): List<Int> {
        return list.flatMap {
            if (it == 0) {
                println("inner $it")
                return listOf()
            }
            println("outer $it")
            listOf(it, it)
        }
    }

    fun duplicateNonZero_V2(list: List<Int>): List<Int> {
        return list.flatMap {
            if (it == 0) {
                println("inner $it")
                return@flatMap listOf()
            }
            println("outer $it")
            listOf(it, it)
        }
    }

    println(duplicateNonZero(listOf(3, 0, 5)))
    println(duplicateNonZero_V2(listOf(3, 0, 5)))
    //println(duplicateNonZero_V3(listOf(3, 0, 5)))


    // The values should be different:
    println(foo)
    println(foo)
    println(foo)

    Child1()

}
open class Parent1 {

    constructor() {
        println("힝힝")
    }
    init { print("parent ") }
}

class Child1 : Parent1() {
    init { print("child ") }
}


var foo: Int = 0
    get() {
        field += 1
        return field
    }



/*
fun duplicateNonZero(list: List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) return listOf()
        listOf(it, it)
    }
}
println(duplicateNonZero(listOf(3, 0, 5)))
*/
