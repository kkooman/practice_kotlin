import java.util.*

fun main(args: Array<String>) {

    println("Hello World!")
    println("args size : " + args.size)
    println("args size : ${args.size + 3}")
    println(GreetingHi().getInt())

    val list = listOf("1", "2")
    println(list)

    val list2 = arrayListOf("1", "2")
    println(list2)

    val list3 = arrayOf("1", "2")
    println(list3)

    var list4 = IntArray(10)
    for (i in 0..list4.size - 1) {
        println("i:${i},  v:${list4[i]}")
    }

    val array = arrayListOf("A", "B", "CC")
    for (i in array.indices) {
        println(array[i])
    }
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }

    // Create fixed sized array
    val point = IntArray(2)
    point[0] = 9
    // Access values directly
    val (x, y) = point
    println(x)
    println(y)

    println(" 1 + = 2  ".replace("""[1234567890\\+\\-\\*\\/]""".toRegex(), "").replace("\\s".toRegex(), "") + "]]")

}

class GreetingHi {
    init {
        for (i in 1..4 step 2) {
            println(i)
        }
    }

    fun getInt(): Long {
        return Date().time
    }
}