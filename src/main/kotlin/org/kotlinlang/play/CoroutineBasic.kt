package org.kotlinlang.play

import kotlinx.coroutines.*

fun main() = runBlocking { // this: CoroutineScope
    println("${Thread.currentThread()} has run. - main")

    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed

    main2()

    val job = GlobalScope.launch {
        println("${Thread.currentThread()} has run. - GlobalScope")
    }

    println(job) // StandaloneCoroutine{Completed}@11028347

}

fun main2() = runBlocking {
    val job = launch(Dispatchers.Default) {
        println("${Thread.currentThread()} has run. - Dispatchers.Default")
    }
}
