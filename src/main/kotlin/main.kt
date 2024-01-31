import java.util.*

fun main(args: Array<String>) {

    println("Hello World!")
    println("args size : " + args.size)
    println("args size : ${args.size + 3}")
    println(GreetingHi().getInt())

    val list = listOf("1", "2")
    println(list)
    println(list.component1())
    println(list.component2())


    val list2 = arrayListOf("11", "22")
    println(list2)
    println(list2.take(5))

    val list3 = arrayOf("111", "222")
    println(list3)
    println(list3.take(5))

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

    println("1" + " A B C          ".trim() + "2")


    val iter = mutableListOf<Status>()
    for (i in 1..50000) {
        iter.add(Status(true))
    }

    var start = System.currentTimeMillis()
    iter.asSequence().forEach { status ->
        status.value = !status.value
    }
    println("1_" + (System.currentTimeMillis() - start))


    start = System.currentTimeMillis()
    iter.forEach { status ->
        status.value = !status.value
    }
    println("2_" + (System.currentTimeMillis() - start))

    start = System.currentTimeMillis()
    iter.asSequence().forEach { status ->
        status.value = !status.value
    }
    println("1_" + (System.currentTimeMillis() - start))


    start = System.currentTimeMillis()
    iter.forEach { status ->
        status.value = !status.value
    }
    println("2_" + (System.currentTimeMillis() - start))

    start = System.currentTimeMillis()
    iter.asSequence().forEach { status ->
        status.value = !status.value
    }
    println("1_" + (System.currentTimeMillis() - start))


    start = System.currentTimeMillis()
    iter.forEach { status ->
        status.value = !status.value
    }
    println("2_" + (System.currentTimeMillis() - start))

    val f: (Long, Long) -> Long = { a: Long, b -> a + b }

}

data class Status(
    var value: Boolean
)

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