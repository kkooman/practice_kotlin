package org.coursera.learn.kotlinforjava

// @See JvmSupport.java
object JvmSupportKotlin {
    @JvmStatic
    val count = 0

    @JvmStatic
    @set:JvmName("setSsum")
    var sum = 0


    @JvmField
    var stickCount = 0
}

object JvmNotSupportKotlin {
    val count = 0
    var sum = 0
}

fun main() {
    JvmSupportKotlin.stickCount
    JvmSupportKotlin.count
    JvmSupportKotlin.sum

    JvmNotSupportKotlin.count
    JvmNotSupportKotlin.sum

}