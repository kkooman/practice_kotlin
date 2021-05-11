package org.kotlinlang.play

import java.util.*

fun main(args: Array<String>) {
    val d1 = LuckDispatcher()
    val d2 = LuckDispatcher()

    d1.getNumber()
    d2.getNumber()

    println("----------------------------------------")
    // object Expression
    rentPrice(10, 2, 1)
    // object Declaration
    DoAuth.printParams("foo", "qwerty")
    println(DoAuth.takeParams("foo", "qwerty"))
    // Companion Objects
    BigBen.getBongs(12)
    // Redundant Companion reference
    BigBen.Bonger.getBongs(99)
}

class LuckDispatcher {
    fun getNumber() {
        var objRandom = Random()
        println(objRandom.nextInt(90))
    }
}

fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }

    // dayRates.standard = 1;
    val total = dayRates.standard + dayRates.festivity + dayRates.special

    println("Total price: $$total")

}

object DoAuth {
    fun printParams(username: String, password: String) {
        println("1 input Auth parameters = $username:$password")
    }

    fun takeParams(username: String, password: String): String {
        return "2 input Auth parameters = $username:$password"
    }
}

class BigBen {
    // similar to the static methods in Java
    // in class name qualifier
    // package-level function instead
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

