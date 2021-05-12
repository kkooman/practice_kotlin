package org.kotlinlang.play

fun main(args: Array<String>) {

    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()


    println("-----------------------------------------")
    // Map
    val map = mapOf("key" to 42)
    println("map : $map") // {key=42}
    val value1 = map["key"]
    val value2 = map["key2"]
    println(value1) // 42
    println(value2) // null
    val value3: Int = map.getValue("key")
    println(value3) // 42

    val mapWithDefault = map.withDefault { k ->
        println("k : $k") // k : key2
        k.length
    }
    println("mapWithDefault.key : ${mapWithDefault.getValue("key")}")
    println("mapWithDefault.key2 : ${mapWithDefault.getValue("key2")}")
    println(mapWithDefault) // {key=42}

    try {
        map.getValue("anotherKey")
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }

}

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {
        println("Updating $accountId...")
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach { (k, v) ->
        println("ID $k: credit $v")
    }
}