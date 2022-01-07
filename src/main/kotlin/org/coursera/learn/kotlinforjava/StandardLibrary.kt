package org.coursera.learn.kotlinforjava

fun main(args: Array<String>) {

    val set = hashSetOf(1, 2, 3)
    val list = arrayListOf(4, 5, 6)
    val list2 = listOf(4, 5, 6)
    val map = hashMapOf(7 to 'A', 8 to 'B', 9 to 'C')

    println(set)
    println(set.javaClass)
    println(list)
    println(list.javaClass)
    println(list2.javaClass)
    println(map)
    println(map.javaClass)


    println(listOf('A','B','C').joinToString(separator = "", prefix = "(", postfix = ")"))
    println(listOf('A','B','C').joinToString(separator = ""))

    val str = """To code, 
        |or not to code?.."""

    println(str)
    println(str.trimMargin())

    val str2 = """To code, 
        or not to code?.."""
    println(str2.trimIndent())

    val regex = "\\d{2}\\.\\d{2}\\.\\d{4}".toRegex()
    println(regex.matches("15.02.2000"))
    println(regex.matches("15.02.16"))

    val regex2 = """\d{2}\.\d{2}\.\d{4}""".toRegex()
    println(regex2.matches("15.02.2000"))
    println(regex2.matches("15.02.16"))

    "123".toInt()
    "1e-10".toDouble()

    // "xx".toInt()
    "xx".toIntOrNull()


    fun getAnswer() = 42

    getAnswer().eq(42)
    getAnswer() eq 42
    getAnswer() eq 43
}

infix fun <T> T.eq(other:T) {
    if (this == other) println("OK")
    else println("Error: != $other");
}