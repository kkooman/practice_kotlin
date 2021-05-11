package org.kotlinlang.play

fun main(args: Array<String>) {
    // Loops
    val cakes = listOf("carrot", "cheese", "chocolate")
    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
    for (i in cakes.indices) {
        println("Yummy, it's a ${cakes[i]} cake!")
    }
    //------------------------------------------------
    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {
        eatACake(cakesEaten)
        cakesEaten++
    }

    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
    //------------------------------------------------
    // Iterators
    val animals = listOf(Animal("zebra"), Animal("lion"));
    val zoo = Zoo(animals);
    for (animal in zoo) {
        println("Watch out, it's a ${animal.name}")
    }
}

fun eatACake(count: Int) = println("Eat a Cake : ${count + 1}")
fun bakeACake() = println("Bake a Cake")

class Animal(val name: String)
class Zoo(private val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}