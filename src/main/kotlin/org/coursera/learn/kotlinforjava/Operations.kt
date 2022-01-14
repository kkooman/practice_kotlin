package org.coursera.learn.kotlinforjava

data class Hero(val name: String, val age: Int, val sex: SEX?)

enum class SEX {
    MALE, FEMALE
}

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60, SEX.MALE),
        Hero("Frenchy", 42, SEX.MALE),
        Hero("The Kid", 9, null),
        Hero("Lady Lauren", 29, SEX.FEMALE),
        Hero("First Mate", 29, SEX.MALE),
        Hero("Sir Stephen", 37, SEX.MALE)
    )

    val (first, second) = heroes
        .flatMap { heroes.map { hero -> it to hero } }
        .maxByOrNull { it.first.age - it.second.age }!!

    println(heroes.flatMap { heroes.map { hero -> it to hero } })
    println(first.name)
}