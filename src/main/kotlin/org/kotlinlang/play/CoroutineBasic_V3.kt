package org.kotlinlang.play

import kotlinx.coroutines.*

suspend fun main() {
    var result = testUnstructuredConcurrency()
    println("result : $result")

    result = testStructuredConcurrency()
    println("result : $result")
}


suspend fun testUnstructuredConcurrency(): Int {
    var count = 0

    /**
     * 대문자 'C'로 시작하는 코루틴 fun
     * 이 CoroutineScope는 내부 작업들이 언제 끝나는지 보장 할 수 없다.
     */
    CoroutineScope(Dispatchers.IO).launch {
        delay(1_000)
        count = 50
    }

    val deferred = CoroutineScope(Dispatchers.IO).async {
        delay(3_000)
        return@async 100
    }

    return count + deferred.await()
}

suspend fun testStructuredConcurrency(): Int {
    var count = 0
    lateinit var deferredCount: Deferred<Int>

    /**
     * 소문자 'c'로 시작하는 코루틴 suspend fun
     * 이 coroutineScope는 내부 작업들을 다 처리하고 완료되므로 작업을 보장 할 수 있다.
     */
    coroutineScope {
        launch(Dispatchers.IO) {
            delay(1_000)
            count = 50
        }

        deferredCount = async(Dispatchers.IO) {
            delay(3_000)
            return@async 100
        }
    }

    return count + deferredCount.await()
}