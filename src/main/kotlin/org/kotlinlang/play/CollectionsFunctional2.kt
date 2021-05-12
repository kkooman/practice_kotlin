package org.kotlinlang.play

import kotlin.math.abs

fun main(args: Array<String>) {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    // associateBy, groupBy
    // Builds a map
    val people = listOf(
        FunnyPerson("John", "Boston", "+1-888-123456"),
        FunnyPerson("Sarah", "Munich", "+49-777-789123"),
        FunnyPerson("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
        FunnyPerson("SaintLastName", "Saint-Petersburg", "+7-999-123456")
    )

    // it.phone is the keySelector
    val phoneBook = people.associateBy { it.phone }
    println(phoneBook) //
    // phone key, value city
    val cityBook = people.associateBy(FunnyPerson::phone, FunnyPerson::city)
    println(cityBook) // {+1-888-123456=Boston, +49-777-789123=Munich, +7-999-456789=Saint-Petersburg, +7-999-123456=Saint-Petersburg}
    val peopleCities = people.groupBy(FunnyPerson::city, FunnyPerson::name)
    println(peopleCities) // {Boston=[John], Munich=[Sarah], Saint-Petersburg=[Svyatoslav, SaintLastName]}
    val lastPersonCity = people.associateBy(FunnyPerson::city, FunnyPerson::name)
    println(lastPersonCity) // {Boston=John, Munich=Sarah, Saint-Petersburg=SaintLastName}

    println("----------------------------------------")
    // partition
    val evenOdd = numbers.partition { it % 2 == 0 }
    println(evenOdd) // ([-2, -4, -6], [1, 3, 5])
    val (positives, negatives) = numbers.partition { it > 0 }
    println("positives: $positives, negatives: $negatives") // positives: [1, 3, 5], negatives: [-2, -4, -6]

    println("----------------------------------------")
    // flatMap
    val fruitsBag = listOf("apple", "orange", "banana", "grapes")
    val clothesBag = listOf("shirts", "pants", "jeans")
    val cart = listOf(fruitsBag, clothesBag) // [[apple, orange, banana, grapes], [shirts, pants, jeans]]
    val mapBag = cart.map { it } // [[apple, orange, banana, grapes], [shirts, pants, jeans]]
    val flatMapBag = cart.flatMap { it } // [apple, orange, banana, grapes, shirts, pants, jeans]
    println(cart)
    println(mapBag)
    println(flatMapBag)

    println("----------------------------------------")
    // minOrNull, maxOrNull
    val empty = emptyList<Int>()
    val only = listOf(3)

    // Numbers: [1, -2, 3, -4, 5, -6], min = -6 max = 5
    println("Numbers: $numbers, min = ${numbers.minOrNull()} max = ${numbers.maxOrNull()}")
    // Empty: [], min = null, max = null
    println("Empty: $empty, min = ${empty.minOrNull()}, max = ${empty.maxOrNull()}")
    // Only: [3], min = 3, max = 3
    println("Only: $only, min = ${only.minOrNull()}, max = ${only.maxOrNull()}")

    println("----------------------------------------")
    // sorted
    val shuffled = listOf(5, 4, 2, 1, 3, -10)
    val natural = shuffled.sorted()
    println(natural)
    val inverted = shuffled.sortedBy { -it }
    println(inverted)
    val descending = shuffled.sortedDescending()
    println(descending)
    val descendingBy = shuffled.sortedByDescending { abs(it) }
    println(descendingBy)

}


data class FunnyPerson(val name: String, val city: String, val phone: String)

