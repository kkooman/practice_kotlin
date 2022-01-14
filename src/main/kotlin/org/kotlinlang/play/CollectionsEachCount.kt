package org.kotlinlang.play

fun main(args: Array<String>) {
    //sampleStart
    val words = "one two three four five six seven eight nine ten".split(' ')
    val frequenciesByFirstChar = words.groupingBy { it.first() }.eachCount()
    println("Counting first letters:")
    println(frequenciesByFirstChar) // {o=1, t=3, f=2, s=2, e=1, n=1}

    val moreWords = "eleven twelve".split(' ')
    val moreFrequencies = moreWords.groupingBy { it.first() }.eachCountTo(frequenciesByFirstChar.toMutableMap())
    println(moreFrequencies) // {o=1, t=4, f=2, s=2, e=2, n=1}
    //sampleEnd
}