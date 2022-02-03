package com.baeldung.kotlin.threadcoroutines

fun main() {
    var threadLocal: Thread? = null
    threadLocal = Thread {
        println("${Thread.currentThread()} has run..")
    }.also {
        it.name = "kotlin thread"
    }

    threadLocal.start()

    val thread = KotlinThread()
    thread.run()

    val threadWithRunnable = Thread(KotlinThread())
    threadWithRunnable.start()

}

class KotlinThread : Runnable {
    public override fun run() {
        println("${Thread.currentThread()} has run..")
    }
}
