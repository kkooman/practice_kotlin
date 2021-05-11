package org.kotlinlang.play

fun main(args: Array<String>) {
    // Hello World
    println("Hello, World!")
    // Functions
    Functions().main();
    InfixFunctions().main();
    OperatorFunctions().main();

    FunctionsWithVarargParameters().main();
}

class Functions {
    fun printMessage(message: String): Unit {
        println(message)
    }

    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun multiply(x: Int, y: Int) = x * y

    fun main() {

        // Function
        printMessage("Hello")
        printMessageWithPrefix("Hello", "Log")
        printMessageWithPrefix("Hello")
        printMessageWithPrefix(prefix = "Log", message = "Hello")
        println(sum(1, 2))
        println(multiply(2, 4))
    }
}

class InfixFunctions {
    fun main() {

        infix fun Int.times(str: String) = str.repeat(this)
        println(2 times "Bye ")

        val pair = "Ferrari" to "Katrina"
        println(pair)

        infix fun String.onto(other: String) = Pair(this, other)
        val myPair = "McLaren" onto "Lucas"
        println(myPair)

        val sophia = Person("Sophia")
        val claudia = Person("Claudia")
        sophia likes claudia
    }
}

class OperatorFunctions {
    fun main() {
        operator fun Int.times(str: String) = str.repeat(this)
        println(2 * "Bye ")

        operator fun String.get(range: IntRange) = substring(range)
        val str = "Always forgive your enemies; nothing annoys them so much."
        println(str[0..14])
    }
}

class FunctionsWithVarargParameters {

    fun main() {
        fun printAll(vararg messages: String) {
            for (m in messages) println(m)
        }
        printAll("Hello", "Hallo", "Salut", "Hola", "你好")

        fun printAllWithPrefix(vararg messages: String, prefix: String) {
            for (m in messages) println(prefix + m)
        }
        printAllWithPrefix(
            "Hello", "Hallo", "Salut", "Hola", "你好",
            prefix = "Greeting: "
        )

        fun log(vararg entries: String) {
            // 이미 존재하는 배열을 함수의 vararg 타입 인자로 전달
            printAll(*entries)
            /*
                printAll(entries)  <- compile error
                Type mismatch.
                Required: String
                Found: Array<out String>
            */
        }
    }
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }
}