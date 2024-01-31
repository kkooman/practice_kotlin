package org.coursera.learn.kotlinforjava


inline fun newMethod(a: Int, func: () -> Unit, func2: () -> Unit) {
    func()
    // someMethod(10, func2) // error, or use 'noinline' keyword solve
}

fun someMethod(a: Int, func: () -> Unit): Int {
    func()
    return 2 * a
}

fun main(args: Array<String>) {
    newMethod(2, { println("Just some dummy function") },
        { println("can't pass function in inline functions") })
}