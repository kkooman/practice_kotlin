package org.kotlinlang.play

fun main(args: Array<String>) {

    val item1 = Item("Bread", 25.0F)
    val item2 = Item("Wine", 29.0F)
    val item3 = Item("Water", 12.0F)
    val order = Order(listOf(item1, item2, item3))

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")

    println("~".nullSafeToString())
    println(null.nullSafeToString())

}

data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)

fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
//Type mismatch: inferred type is Float? but Float was expected

val Order.commaDelimitedItemNames: String get() = items.map { it.name }.joinToString()

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"  // 1