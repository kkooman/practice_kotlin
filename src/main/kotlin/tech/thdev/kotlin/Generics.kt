package tech.thdev.kotlin

interface Output<T> {
    fun isArgument(argument: T): Boolean
}

class ExampleOutputTest {
    private val items = ArrayList<Output<String>>()

    init {
        items.add(object : Output<String> {
            override fun isArgument(argument: String): Boolean {
                return false
            }
        })
        items.add(object : Output<String> {
            override fun isArgument(argument: String): Boolean {
                return true
            }
        })
    }

    // out is read only,  ? extends T (java)
    private fun printAll(items: ArrayList<out Output<String>>) {
        /*  // Error
        items.add(object : Output<String> {
            override fun isArgument(argument: String) = false
        })
        */
        // items.add(null) - Error
        items.indices
            .filter { items[it].isArgument("") }
            .forEach { println("item : " + items[it]) }

    }

    // in is write only,  ? super T (java)
    private fun addItem(items: ArrayList<in Output<String>>) {
        items.add(object : Output<String> {
            override fun isArgument(argument: String) = false
        })
        // items.add(null) Error
        /*  // Error
        items.indices
            .filter { items[it].isArgument("") }
            .forEach { println("item : " + items[it]) }
        */
    }
}

private fun <T> abc(t: T) {

}

private fun <T> createArrayList(): List<T> {
    return ArrayList()
}

fun main() {
    fun foo(): Int = 1
    fun boo(): Int? = 1

    // Use
    abc<String>("ABC")
    abc("ABC")

    // Use
    createArrayList<String>()
    createArrayList<Boolean>()
}