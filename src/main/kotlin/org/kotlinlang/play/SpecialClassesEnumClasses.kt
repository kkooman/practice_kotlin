package org.kotlinlang.play

fun main(args: Array<String>) {

    val state = State.RUNNING
    val message = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    println("------------------------------------------")
    val red = Color.RED
    println(red)
    println(red.containsRed())
    println(Color.BLUE.containsRed())

    println(Color.GREEN)
    println(Color.GREEN.ordinal)
    println(Color.GREEN.rgb)
    println(0x00FF00)
}

enum class State {
    IDLE, RUNNING, FINISHED
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}


enum class Color2 {
    // Too many arguments for private constructor Color2() defined in org.kotlinlang.play.Color2
    /*
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
    */

}