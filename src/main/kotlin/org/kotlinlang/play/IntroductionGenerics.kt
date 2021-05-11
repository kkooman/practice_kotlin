package org.kotlinlang.play

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)
fun main(args: Array<String>) {
    println(mutableStackOf(0.62, 3.14, 2.7))
    println(mutableStackOf("B", "CC", "AAA"))
}

class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}
