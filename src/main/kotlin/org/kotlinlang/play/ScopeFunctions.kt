package org.kotlinlang.play

fun main(args: Array<String>) {
    /*
    let
        - 지정된 값이 null 이 아닌 경우에 코드를 실행해야 하는 경우.
        - Nullable 객체를 다른 Nullable 객체로 변환하는 경우.
        - 단일 지역 변수의 범위를 제한 하는 경우.
    */
    val empty = "test".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    fun printNonNull(str: String?) {
        println("Printing \"$str\":")

        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First", "Second")

    println("--------------------------------------------------");
    /*
     run : Like let, run
     */
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
            length // run returns the length of the given String if it's not null.
        }
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

    println("--------------------------------------------------")
    //with
    val configuration = Configuration(host = "127.0.0.1", port = 9000)
    with(configuration) {
        println("$host:$port")
    }

    println("${configuration.host}:${configuration.port}")

    println("--------------------------------------------------")
    //apply
    val jake = PersonScope()
    val stringDescription = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()
    println(stringDescription)

    println("--------------------------------------------------")
    //also
    val jake2 = PersonScope("Jake", 30, "Android developer")
        .also {
            writeCreationLog(it)
        }
}

fun writeCreationLog(p: PersonScope) {
    println("A new person ${p.name} was created.")
}

fun customPrint(s: String) {
    print(s.uppercase())
}

class Configuration(var host: String, var port: Int)
data class PersonScope(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}
