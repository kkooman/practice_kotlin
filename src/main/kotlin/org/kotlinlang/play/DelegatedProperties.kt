package org.kotlinlang.play

import kotlin.coroutines.suspendCoroutine
import kotlin.reflect.KProperty

fun main(args: Array<String>) {
    val example = Example()
    println(example.p)
    example.p = "NEW"

    println(example)
}

class Example {
    var p: String by Delegate()
    override fun toString() = "Example Class"
}

class Delegate() {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${prop.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
        println("$value has been assigned to ${prop.name} in $thisRef")
    }
}
